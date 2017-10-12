package com.example.retrofitsample.api;

import android.content.Context;
import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * @Function  自定义 Obsever
 * @Data 2017/10/11
 * @Author daixiansen
 */

public class MyObsever<T> implements Observer<T>, ProgressCancelListener {

    public static final String TAG = MyObsever.class.getSimpleName();

    private final ObserverOnNextListener mObserverOnNextListener;
    private final Context mContext;
    private ProgressDialogHandler mProgressDialogHandler;
    private Disposable mdisposable;


    public MyObsever(Context context, ObserverOnNextListener onNextListener) {
        this.mContext = context;
        this.mObserverOnNextListener = onNextListener;
        mProgressDialogHandler = new ProgressDialogHandler(context, this, true);
    }

    private void showProgressDialog() {
        if (mProgressDialogHandler != null) {
            mProgressDialogHandler.obtainMessage(ProgressDialogHandler.SHOW_PROGRESS_DIALOG).sendToTarget();
        }
    }

    private void dismissProgressDialog() {
        if (mProgressDialogHandler != null) {
            mProgressDialogHandler.obtainMessage(ProgressDialogHandler.DISMISS_PROGRESS_DIALOG)
                    .sendToTarget();
            mProgressDialogHandler = null;
        }
    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {
        this.mdisposable = d;
        showProgressDialog();
        Log.e(TAG, "onSubscribe");
    }

    @Override
    public void onNext(@NonNull T t) {
        if (mObserverOnNextListener != null) {
            mObserverOnNextListener.onNext(t);
        }
    }

    @Override
    public void onError(@NonNull Throwable e) {
        dismissProgressDialog();
        Log.e(TAG, "onError: ", e);
    }

    @Override
    public void onComplete() {
        dismissProgressDialog();
        Log.d(TAG, "onComplete: ");
    }

    @Override
    public void onCancelProgress() {
        //如果处于订阅状态，则取消订阅
        if (!mdisposable.isDisposed()) {
            mdisposable.dispose();
        }
    }

    public interface ObserverOnNextListener<T> {
        void onNext(T t);
    }


}
