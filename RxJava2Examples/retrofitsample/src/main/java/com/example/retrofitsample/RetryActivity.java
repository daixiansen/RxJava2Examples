package com.example.retrofitsample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Description ${TODO}
 * Author daixiansen
 * Date   2017/11/3 18:08
 **/

public class RetryActivity extends AppCompatActivity {

    private static final String TAG = RetryActivity.class.getSimpleName();
    private static final String MSG_WAIT_SHORT = "wait_short";
    private static final String MSG_WAIT_LONG = "wait_long";

    private static final String[] MSG_ARRAY = new String[]{
            MSG_WAIT_SHORT,
            MSG_WAIT_SHORT,
            MSG_WAIT_LONG,
            MSG_WAIT_LONG
    };

    private CompositeDisposable mCompositeDisposable;
    private int mMsgIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retry);
        findViewById(R.id.mTvRetryWhen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRetryRequest();
            }
        });
        mCompositeDisposable = new CompositeDisposable();
    }


    public static void startActivity(Context context){
        Intent intent = new Intent(context,RetryActivity.class);
        context.startActivity(intent);
    }

    private void startRetryRequest() {
        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception {
                int msgLen = MSG_ARRAY.length;
                doWork();
                //模拟请求的结果，前四次都返回失败，并将失败信息递交给retryWhen。
                if (mMsgIndex < msgLen) { //模拟请求失败的情况。
                    e.onError(new Throwable(MSG_ARRAY[mMsgIndex]));
                    mMsgIndex++;
                } else {
                    //模拟请求成功的情况。
                    e.onNext("Work Success");
                    e.onComplete();
                }
            }

        }).retryWhen(new Function<Observable<Throwable>, ObservableSource<?>>() {

            private int mRetryCount;

            @Override
            public ObservableSource<?> apply(Observable<Throwable> throwableObservable) throws Exception {
                return throwableObservable.flatMap(new Function<Throwable, ObservableSource<?>>() {

                    @Override
                    public ObservableSource<?> apply(Throwable throwable) throws Exception {
                        String errorMsg = throwable.getMessage();
                        long waitTime = 0;
                        switch (errorMsg) {
                            case MSG_WAIT_SHORT:
                                waitTime = 2000;
                                break;
                            case MSG_WAIT_LONG:
                                waitTime = 4000;
                                break;
                            default:
                                break;
                        }
                        Log.d(TAG, "发生错误，尝试等待时间=" + waitTime + ",当前重试次数=" + mRetryCount);
                        mRetryCount++;
                        return waitTime > 0 && mRetryCount <= 4 ? Observable.timer(waitTime, TimeUnit.MILLISECONDS) : Observable.error(throwable);
                    }

                });
            }

        });


        DisposableObserver<String> disposableObserver = new DisposableObserver<String>() {

            @Override
            public void onNext(String value) {
                Log.d(TAG, "DisposableObserver onNext=" + value);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "DisposableObserver onError=" + e);
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "DisposableObserver onComplete");
            }
        };
        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(disposableObserver);
        mCompositeDisposable.add(disposableObserver);
    }

    private void doWork() {
        long workTime = (long) (Math.random() * 500) + 500;
        try {
            Log.d(TAG, "doWork start,  threadId=" + Thread.currentThread().getId());
            Thread.sleep(workTime);
            Log.d(TAG, "doWork finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
