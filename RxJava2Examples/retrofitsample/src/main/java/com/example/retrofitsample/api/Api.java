package com.example.retrofitsample.api;

import com.example.retrofitsample.server.MovieApis;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @Function 网络请求api
 * @Data 2017/10/11
 * @Author daixiansen
 */

public class Api {
    public static String baseUrl = "https://api.douban.com/v2/movie/";

    public static MovieApis apiService;

    //单例
    public static MovieApis getApiService() {
        if (apiService == null) {
            synchronized (Api.class) {
                if (apiService == null) {
                    new Api();
                }
            }
        }
        return apiService;
    }

    private Api() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())//请求的结果转为实体类
                //适配RxJava2.0,RxJava1.x则为RxJavaCallAdapterFactory.create()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(MovieApis.class);
    }
}
