package com.example.retrofitlibrary.interceptor;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 请求拦截器  统一添加请求头使用
 */

public class HeaderInterceptor implements Interceptor {

    private Map<String, String> headerMaps = new TreeMap<>();

    public HeaderInterceptor(Map<String, String> headerMaps) {
        this.headerMaps = headerMaps;
    }


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder request = chain.request().newBuilder();
        if (headerMaps != null && headerMaps.size() > 0) {
            for (Map.Entry<String, String> entry : headerMaps.entrySet()) {
                request.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return chain.proceed(request.build());
    }

}
