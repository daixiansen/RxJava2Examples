package com.example.retrofitsample.mvp;

import android.util.Log;

import com.example.retrofitsample.bean.VoiceBean;
import com.example.retrofitsample.server.GetRequest_Interface;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description ${TODO}
 * Author daixiansen
 * Date   2017/11/2 18:45
 **/

public class ScondEngine {
    public static final String TAG = ScondEngine.class.getSimpleName();

    public static final String BASE_URL = "http://v.6.cn/yl/";
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
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        Log.e(TAG,"-----开始请求网络-----");

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
        Call<VoiceBean> call = request.getCall(stringMap);
        call.enqueue(new Callback<VoiceBean>() {


            @Override
            public void onResponse(Call<VoiceBean> call, Response<VoiceBean> response) {
                VoiceBean voiceBean = response.body();
                if(mCallBack != null){
                    mCallBack.onRespose(voiceBean);
                }
            }

            @Override
            public void onFailure(Call<VoiceBean> call, Throwable t) {
                Log.e(TAG, "onFailure 当前线程 -> " + Thread.currentThread().getName());
                Log.e(TAG, "连接失败..." + t.getMessage());
            }
        });
    }
}
