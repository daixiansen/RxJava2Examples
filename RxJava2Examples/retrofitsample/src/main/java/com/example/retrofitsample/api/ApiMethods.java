package com.example.retrofitsample.api;

import com.example.retrofitsample.bean.MovieBean;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @Function 网络接口方法
 * @Data 2017/10/11
 * @Author daixiansen
 */

public class ApiMethods {
    /**
     * 封装线程管理和订阅的过程
     */
    public static void apisubscribe(Observable observable, Observer observer) {
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    /**
     * 用于获取豆瓣电影Top250的数据
     *
     * @param observer 由调用者传过来的观察者对象
     * @param start    起始位置
     * @param count    获取长度
     */
    public static void getTopMovie(Observer<MovieBean> observer, int start, int count) {
        apisubscribe(Api.getApiService().getTopMovie(start, count), observer);
    }

    /**
     * 用于获取豆瓣电影Top250的数据   增加拦截器和缓存策略
     *
     * @param observer 由调用者传过来的观察者对象
     * @param start    起始位置
     * @param count    获取长度
     */
    public static void getTopMovie3(Observer<MovieBean> observer, int start, int count) {
        apisubscribe(ApiStrategy.getApiService().getTopMovie(start,count), observer);
    }
}
