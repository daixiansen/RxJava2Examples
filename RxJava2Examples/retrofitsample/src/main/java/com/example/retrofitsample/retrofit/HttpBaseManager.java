package com.example.retrofitsample.retrofit;

import com.example.retrofitsample.MyApplication;
import com.example.retrofitsample.util.HttpLogger;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * @Function
 * @Data 2017/10/20
 * @Author daixiansen
 */

public class HttpBaseManager {
    public static String baseUrl = "https://api.douban.com/v2/movie/";
    //读超时长，单位：毫秒
    public static final int READ_TIME_OUT = 7676;
    //连接时长，单位：毫秒
    public static final int CONNECT_TIME_OUT = 7676;

    protected OkHttpClient getOkHttpClient() {
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor(new HttpLogger());
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //缓存
        File cacheFile = new File(MyApplication.getContext().getCacheDir(), "cache");
        //100Mb
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100);
        //创建一个OkHttpClient并设置超时时间
        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(READ_TIME_OUT, TimeUnit.MILLISECONDS)
                .connectTimeout(CONNECT_TIME_OUT, TimeUnit.MILLISECONDS)
                .addInterceptor(logInterceptor)
                .cache(cache)
                .build();
        return client;
    }
}
