package com.example.retrofitsample.mvp;

import android.util.Log;

import com.example.retrofitsample.bean.VoiceBean;
import com.example.retrofitsample.server.GetRequest_Interface;
import com.google.gson.JsonSyntaxException;
import com.orhanobut.logger.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description ${TODO}
 * Author daixiansen
 * Date   2017/11/2 18:45
 **/

public class ScondEngine {
    public static final String TAG = ScondEngine.class.getSimpleName();

    public static final String BASE_URL = "https://v.6.cn/yl/";
    private final CallBack mCallBack;


    public ScondEngine(CallBack callBack) {
        this.mCallBack = callBack;
    }

    interface CallBack {
        void onRespose(VoiceBean voiceBean);
    }

    public void getData() {
        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL) // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        Log.e(TAG, "-----开始请求网络-----");

        // 步骤5:创建 网络请求接口 的实例
        GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);

        //对 发送请求 进行封装
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("padapi", "yl-recommend.php");
        stringMap.put("gender", "");
        stringMap.put("skill", "");
        stringMap.put("p", "1");
        stringMap.put("size", "20");
        stringMap.put("city", "");

        request.getCall2(stringMap)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
//                .doOnNext(new Consumer<VoiceBean>() {
//                    private int num = 0;
//
//                    @Override
//                    public void accept(VoiceBean voiceBean) throws Exception {
//                        Logger.t(TAG).e("doOnNext -> " + voiceBean.toString());
//                        if ("001".equals(voiceBean.getFlag())) {
//                            if (num < 3) {
//                                Observable.error(new JsonIOException("json 解析错误"));
//                                num++;
//                            }
//                        }
//                    }
//                })
                .retryWhen(new Function<Observable<Throwable>, ObservableSource<?>>() {
                    @Override
                    public ObservableSource<?> apply(Observable<Throwable> throwableObservable) throws Exception {
                        return throwableObservable.flatMap(new Function<Throwable, ObservableSource<?>>() {
                            private int i = 0;

                            @Override
                            public ObservableSource<?> apply(Throwable throwable) throws Exception {
                                Logger.t(TAG).e("retryWhen -> " + throwable.getMessage());
                                if (throwable instanceof JsonSyntaxException && i<3) {
                                    i++;
                                    Logger.t(TAG).e("重试次数 -> " + i);
                                    return Observable.timer(0, TimeUnit.MICROSECONDS);
                                } else {
                                    return Observable.error(throwable);
                                }
                            }
                        });
                    }
                }).subscribe(new Observer<VoiceBean>() {
            @Override
            public void onSubscribe(Disposable d) {
                Logger.t(TAG).e("Disposable ");
            }

            @Override
            public void onNext(VoiceBean voiceBean) {
                Logger.t(TAG).e("onNext ");
            }

            @Override
            public void onError(Throwable e) {
                Logger.t(TAG).e("onError -> " + e.getMessage());
            }

            @Override
            public void onComplete() {
                Logger.t(TAG).e("onComplete");
            }
        });


//        Call<VoiceBean> call = request.getCall(stringMap);
//        call.enqueue(new Callback<VoiceBean>() {
//
//
//            @Override
//            public void onResponse(Call<VoiceBean> call, Response<VoiceBean> response) {
//                VoiceBean voiceBean = response.body();
//                if(mCallBack != null){
//                    mCallBack.onRespose(voiceBean);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<VoiceBean> call, Throwable t) {
//                Log.e(TAG, "onFailure 当前线程 -> " + Thread.currentThread().getName());
//                Log.e(TAG, "连接失败..." + t.getMessage());
//            }
//        });
    }
}
