package com.nanchen.rxjava2examples.module.rxjava2.usecases.flatMap;

import android.util.Log;

import com.nanchen.rxjava2examples.module.rxjava2.operators.item.RxOperatorBaseActivity;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * flatMap 使用场景
 * <p>
 * 多个网络请求依次依赖，比如：
 * 1、注册用户前先通过接口A获取当前用户是否已注册，再通过接口B注册;
 * 2、注册后自动登录，先通过注册接口注册用户信息，注册成功后马上调用登录接口进行自动登录。
 * <p>
 * 例子所用API来自天狗网
 * <p>
 * <p>
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-07-03  8:58
 */

public class RxCaseFlatMapActivity extends RxOperatorBaseActivity {

    private static final String TAG = "RxCaseFlatMapActivity";

    private static final String GET_URL = "http://v.6.cn/coop/mobile/index.php?padapi=coop-mobile-getlivelistnew.php";
    private static final String POST_URL = "http://v.6.cn/coop/mobile/index.php?padapi=coop-mobile-getUserInfo.php";


    @Override
    protected String getSubTitle() {
        return "多个网络请求依次依赖";
    }

    /**
     * 该例子采用天狗网的健康食品API：http://www.tngou.net/doc/food
     */
//    @Override
//    protected void doSomething() {
//        Rx2AndroidNetworking.get("http://www.tngou.net/api/food/list")
//                .addQueryParameter("rows", 1 + "")
//                .build()
//                .getObjectObservable(FoodList.class) // 发起获取食品列表的请求，并解析到FootList
//                .subscribeOn(Schedulers.io())        // 在io线程进行网络请求
//                .observeOn(AndroidSchedulers.mainThread()) // 在主线程处理获取食品列表的请求结果
//                .doOnNext(new Consumer<FoodList>() {
//                    @Override
//                    public void accept(@NonNull FoodList foodList) throws Exception {
//                        // 先根据获取食品列表的响应结果做一些操作
//                        Log.e(TAG, "accept: doOnNext :" + foodList.toString());
//                        mRxOperatorsText.append("accept: doOnNext :" + foodList.toString() + "\n");
//                    }
//                })
//                .observeOn(Schedulers.io()) // 回到 io 线程去处理获取食品详情的请求
//                .flatMap(new Function<FoodList, ObservableSource<FoodDetail>>() {
//                    @Override
//                    public ObservableSource<FoodDetail> apply(@NonNull FoodList foodList) throws Exception {
//                        if (foodList != null && foodList.getTngou() != null && foodList.getTngou().size() > 0) {
//                            return Rx2AndroidNetworking.post("http://www.tngou.net/api/food/show")
//                                    .addBodyParameter("id", foodList.getTngou().get(0).getId() + "")
//                                    .build()
//                                    .getObjectObservable(FoodDetail.class);
//                        }
//                        return null;
//
//                    }
//                })
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<FoodDetail>() {
//                    @Override
//                    public void accept(@NonNull FoodDetail foodDetail) throws Exception {
//                        Log.e(TAG, "accept: success ：" + foodDetail.toString());
//                        mRxOperatorsText.append("accept: success ：" + foodDetail.toString() + "\n");
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(@NonNull Throwable throwable) throws Exception {
//                        Log.e(TAG, "accept: error :" + throwable.getMessage());
//                        mRxOperatorsText.append("accept: error :" + throwable.getMessage() + "\n");
//                    }
//                });
//
//    }
    @Override
    protected void doSomething() {
        Rx2AndroidNetworking.post(GET_URL)
                .addQueryParameter("padapi", "coop-mobile-getlivelistnew.php")
                .addBodyParameter("av", "2.6")
                .addBodyParameter("encpass", "hwAlT-ecjR00sGDD8tpFtzk7cLVdw_z-MC_aurS5_p71BQAzDsWIWeETMEc6cjfYsry2ocGH8MU6siCTZZvgeMBKMhT6SvpCokbIMAiKBx7Uy1dJwlTLMuQCiiTqtWnTs-5OrGdr0lVvaO7thAK-Bg10007")
                .addBodyParameter("logiuid", "66515829")
                .addBodyParameter("p", "1")
                .addBodyParameter("rate", "100")
                .addBodyParameter("size", "20")
                .addBodyParameter("type", "followList")
                .build()
                .getObjectObservable(RoomList.class) // 发起获取食品列表的请求，并解析到FootList
                .subscribeOn(Schedulers.io())        // 在io线程进行网络请求
                .observeOn(AndroidSchedulers.mainThread()) // 在主线程处理获取食品列表的请求结果
                .doOnNext(new Consumer<RoomList>() {
                    @Override
                    public void accept(@NonNull RoomList roomList) throws Exception {
                        // 先根据获取食品列表的响应结果做一些操作
                        Log.e(TAG, "accept: dDoOnNext :" + roomList.toString());
                        Log.e(TAG, "doOnNext" + "    " + Thread.currentThread().getName());
                        mRxOperatorsText.append("accept: doOnNext :" + roomList.toString() + "\n");
                    }
                })
                .observeOn(Schedulers.io()) // 回到 io 线程去处理获取食品详情的请求
                .flatMap(new Function<RoomList, Observable<UserInfo>>() {
                    @Override
                    public Observable<UserInfo> apply(@NonNull RoomList roomList) throws Exception {

                        Log.e(TAG, "flatMap" + "    " + Thread.currentThread().getName());

                        if ("001".equals(roomList.getFlag())) {
                            return Rx2AndroidNetworking.post(POST_URL)
                                    .addQueryParameter("padapi", "coop-mobile-getUserInfo.php")
                                    .addBodyParameter("av", "1.3")
                                    .addBodyParameter("encpass", "hwAlT-ecjR00sGDD8tpFtzk7cLVdw_z-MC_aurS5_p71BQAzDsWIWeETMEc6cjfYsry2ocGH8MU6siCTZZvgeMBKMhT6SvpCokbIMAiKBx7Uy1dJwlTLMuQCiiTqtWnTs-5OrGdr0lVvaO7thAK-Bg10007")
                                    .addBodyParameter("logiuid", "66515829")
                                    .addBodyParameter("tuid", "66515829")
                                    .build()
                                    .getObjectObservable(UserInfo.class);
//                            return null;
                        }
                        return null;

                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserInfo>() {
                    public Disposable disposable;

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        this.disposable = d;
                    }

                    @Override
                    public void onNext(@NonNull UserInfo userInfo) {
                        Log.e(TAG, "onNext" + "    " + Thread.currentThread().getName());
                        Log.e(TAG, "subscribe onNext : success ：" + userInfo.toString());
                        mRxOperatorsText.append("accept: success ：" + userInfo.toString() + "\n");
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.e(TAG, "accept: error :" + e.getMessage());
                        mRxOperatorsText.append("accept: error :" + e.getMessage() + "\n");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
