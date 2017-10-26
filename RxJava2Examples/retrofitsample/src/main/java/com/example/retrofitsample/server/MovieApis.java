package com.example.retrofitsample.server;

import com.example.retrofitsample.bean.MovieBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 *
 * 豆瓣电影请求排行接口
 * Created by 戴先森 on 2017/10/10.
 */

public interface MovieApis {

    // https://api.douban.com/v2/movie/top250?start=0&count=10

    String BASE_URL = "https://api.douban.com/v2/movie/";

    @GET("top250?")
    Observable<MovieBean> getTopMovie(@Query("start") int start, @Query("count") int count);


    @GET("top250?")
    Observable<String> getTopMovieString(@Query("start") int start, @Query("count") int count);
}
