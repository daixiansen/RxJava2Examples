package com.example.retrofitsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.retrofitsample.api.ApiMethods;
import com.example.retrofitsample.api.MyObsever;
import com.example.retrofitsample.bean.GithubBean;
import com.example.retrofitsample.bean.MovieBean;
import com.example.retrofitsample.bean.Translation;
import com.example.retrofitsample.server.GetRequest_Interface;
import com.example.retrofitsample.server.GitHubService;
import com.example.retrofitsample.server.MovieService;
import com.example.retrofitsample.server.PostRequest_Interface;
import com.example.retrofitsample.util.StringConverterFactory;
import com.orhanobut.logger.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import static com.example.retrofitsample.api.ApiMethods.getTopMovie;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String BASE_URL = "http://v.6.cn/yl/";
    public static final String BASE_URL2 = "http://v.6.cn/";
    public static final String TAG = MainActivity.class.getSimpleName();
    private android.widget.Button btgetrequst;
    private android.widget.Button btpostrequst;
    private Button bt_rxjava_requst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        this.btpostrequst = (Button) findViewById(R.id.bt_post_requst);
        this.btgetrequst = (Button) findViewById(R.id.bt_get_requst);
        this.bt_rxjava_requst = (Button) findViewById(R.id.bt_rxjava_requst);
        btpostrequst.setOnClickListener(this);
        btgetrequst.setOnClickListener(this);
        bt_rxjava_requst.setOnClickListener(this);
        findViewById(R.id.bt_github_requst).setOnClickListener(this);
    }


    public void getRequest() {

        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL) // 设置 网络请求 Url
                .addConverterFactory(StringConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

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
//        Call<VoiceBean> call = request.getCall(stringMap);
//
//        call.enqueue(new Callback<VoiceBean>() {
//
//
//            @Override
//            public void onResponse(Call<VoiceBean> call, Response<VoiceBean> response) {
//                VoiceBean voiceBean = response.body();
//                Log.e(TAG, "onResponse 当前线程 -> " + Thread.currentThread().getName());
//                Log.e(TAG, voiceBean.toString());
//            }
//
//            @Override
//            public void onFailure(Call<VoiceBean> call, Throwable t) {
//                Log.e(TAG, "onFailure 当前线程 -> " + Thread.currentThread().getName());
//                Log.e(TAG, "连接失败..." + t.getMessage());
//            }
//        });

//        Observable<VoiceBean> voiceBeanObservable = request.getCall2(stringMap);
//        voiceBeanObservable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<VoiceBean>() {
//                    @Override
//                    public void onSubscribe(@NonNull Disposable d) {
//                        Logger.e("onSubscribe");
//                    }
//
//                    @Override
//                    public void onNext(@NonNull VoiceBean voiceBean) {
//                        Logger.e(voiceBean.toString());
//                    }
//
//                    @Override
//                    public void onError(@NonNull Throwable e) {
//                        Logger.e("onError -> " + e.getMessage());
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Logger.e("onComplete");
//                    }
//                });

        Observable<String> voiceBeanObservable = request.getCall3(stringMap);
        voiceBeanObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Logger.e("onSubscribe");
                    }

                    @Override
                    public void onNext(@NonNull String voiceBean) {
                        Logger.json(voiceBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Logger.e("onError -> " + e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Logger.e("onComplete");
                    }
                });
    }


    public void postRequest() {

        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fanyi.youdao.com/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .build();

        // 步骤5:创建 网络请求接口 的实例
        PostRequest_Interface request = retrofit.create(PostRequest_Interface.class);

        //对 发送请求 进行封装(设置需要翻译的内容)
        Call<Translation> call = request.getCall("I love you");

        //步骤6:发送网络请求(异步)
        call.enqueue(new Callback<Translation>() {

            //请求成功时回调
            @Override
            public void onResponse(Call<Translation> call, Response<Translation> response) {
                // 请求处理,输出结果
                // 输出翻译的内容
                System.out.println("翻译是：" + response.body().getTranslateResult().get(0).get(0).getTgt());
            }

            //请求失败时回调
            @Override
            public void onFailure(Call<Translation> call, Throwable throwable) {
                System.out.println("请求失败");
                System.out.println(throwable.getMessage());
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_get_requst:
                getRequest();
                break;
            case R.id.bt_post_requst:
                postRequest();
                break;
            case R.id.bt_rxjava_requst:
//                rxjavaRequest();
//                rxjavaRequest2();
//                rxjavaRequest3();
//                rxjavaRequest4();
                rxjavaRequest5();
                break;
            case R.id.bt_github_requst:
                githubRequst();
                break;
        }
    }

    private void rxjavaRequest5() {
        MyObsever.ObserverOnNextListener<MovieBean> listener = new MyObsever.ObserverOnNextListener<MovieBean>() {
            @Override
            public void onNext(MovieBean movieBean) {
                Log.e(TAG, "onNext: " + movieBean.getTitle());
                List<MovieBean.SubjectsBean> subjects = movieBean.getSubjects();
                for (MovieBean.SubjectsBean sub : subjects) {
                    Log.e(TAG, "onNext: " + sub.getId() + "," + sub.getYear() + "," + sub.getTitle());
                }
            }
        };
        ApiMethods.getTopMovie3(new MyObsever<MovieBean>(this, listener), 0, 10);
    }

    private void rxjavaRequest4() {
        MyObsever.ObserverOnNextListener<MovieBean> listener = new MyObsever.ObserverOnNextListener<MovieBean>() {
            @Override
            public void onNext(MovieBean movieBean) {
                Log.e(TAG, "onNext: " + movieBean.getTitle());
                List<MovieBean.SubjectsBean> subjects = movieBean.getSubjects();
                for (MovieBean.SubjectsBean sub : subjects) {
                    Log.e(TAG, "onNext: " + sub.getId() + "," + sub.getYear() + "," + sub.getTitle());
                }
            }
        };
        ApiMethods.getTopMovie(new MyObsever<MovieBean>(this, listener), 0, 10);
    }

    /**
     * rxjava 和 retrofit 简单封装
     */
    private void rxjavaRequest3() {

        Observer<MovieBean> movieBeanObserver = new Observer<MovieBean>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Log.e(TAG, "onSubscribe");
            }

            @Override
            public void onNext(@NonNull MovieBean movieBean) {
                Log.e(TAG, "onNext: " + movieBean.getTitle());
                List<MovieBean.SubjectsBean> subjects = movieBean.getSubjects();
                for (MovieBean.SubjectsBean sub : subjects) {
                    Log.e(TAG, "onNext: " + sub.getId() + "," + sub.getYear() + "," + sub.getTitle());
                }
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        getTopMovie(movieBeanObserver, 0, 10);
    }

    private void githubRequst() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GitHubService.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        GitHubService gitHubService = retrofit.create(GitHubService.class);
        Call<GithubBean> githubBeanCall =
                gitHubService.getUserInfo("daixiansen");
        githubBeanCall.enqueue(new Callback<GithubBean>() {
            @Override
            public void onResponse(Call<GithubBean> call, Response<GithubBean> response) {
                GithubBean githubBean = response.body();
                Log.e(TAG, "githubBean -> " + githubBean.toString());
            }

            @Override
            public void onFailure(Call<GithubBean> call, Throwable t) {

            }
        });
    }

    private void rxjavaRequest() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MovieService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        MovieService movieService = retrofit.create(MovieService.class);

        movieService.getTopMovie(0, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MovieBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Log.e(TAG, "onSubscribe: ");
                    }

                    @Override
                    public void onNext(@NonNull MovieBean movieBean) {
                        Log.e(TAG, "onNext: " + movieBean.getTitle());
                        List<MovieBean.SubjectsBean> subjects = movieBean.getSubjects();
                        for (MovieBean.SubjectsBean sub : subjects) {
                            Log.e(TAG, "onNext: " + sub.getId() + "," + sub.getYear() + "," + sub.getTitle());
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.e(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Log.e(TAG, "onComplete: Over!");
                    }
                });
    }

    private void rxjavaRequest2() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MovieService.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        MovieService movieService = retrofit.create(MovieService.class);
        movieService.getTopMovieString(0, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Log.e(TAG, "onSubscribe: ");
                    }

                    @Override
                    public void onNext(@NonNull String s) {
                        Log.e(TAG, "返回json数据 -> " + s);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

