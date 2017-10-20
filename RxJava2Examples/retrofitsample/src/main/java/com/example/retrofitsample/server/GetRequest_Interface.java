package com.example.retrofitsample.server;


import com.example.retrofitsample.bean.VoiceBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Carson_Ho on 17/3/20.
 */

public interface GetRequest_Interface {

    String url = "index.php?padapi=yl-recommend.php&gender=&skill=&tagid=&p=1&size=20&city=";


    @GET("index.php")
    Call<VoiceBean> getCall(@QueryMap Map<String,String> map);
    // 注解里传入 网络请求 的部分URL地址
    // getCall()是接受网络请求数据的方法


    /**
     * 这种情况最后我们无法获取到返回的Header和响应码的，如果我们需要这两者，提供两种方案：
     1、用Observable<Response<T>> 代替 Observable<T> ,这里的Response指retrofit2.Response
     2、用Observable<Result<T>> 代替 Observable<T>，这里的Result是指retrofit2.adapter.rxjava.Result,这个Result中包含了Response的实例
     * @param map
     * @return
     */
    @GET("index.php")
    Observable<VoiceBean> getCall2(@QueryMap Map<String,String> map);

    @GET("index.php")
    Observable<String> getCall3(@QueryMap Map<String,String> map);


    @GET("index.php")
    Observable<Response<VoiceBean>> getCall4(@QueryMap Map<String,String> map);
}
