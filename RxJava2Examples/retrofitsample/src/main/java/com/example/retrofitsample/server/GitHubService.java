package com.example.retrofitsample.server;

import com.example.retrofitsample.bean.GithubBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @Function
 * @Data 2017/10/11
 * @Author daixiansen
 */

public interface GitHubService {
    String BASEURL = "https://api.github.com/";

    @GET("users/{user}")
    Call<String> getData(@Path("user") String user);

    @GET("users/{user}")
    Call<GithubBean> getUserInfo(@Path("user") String user);
}
