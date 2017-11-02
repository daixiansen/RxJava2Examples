package com.example.retrofitsample.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.retrofitsample.R;
import com.example.retrofitsample.bean.VoiceBean;

public class ScondActivity extends AppCompatActivity implements ScondView {

    private VoiceBean mVoiceBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);
        findViewById(R.id.bt_requst).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String simpleName = ScondActivity.class.getSimpleName();
                Log.e("test", simpleName);
                String simpleName1 = ScondActivity.class.getSimpleName();
                Log.e("test", simpleName1);
            }
        });
//        ScondPresenter mScondPresenter = new ScondPresenter(this);
//        mScondPresenter.getData();
    }

    @Override
    public void onRespose(VoiceBean voiceBean) {
        this.mVoiceBean = voiceBean;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}
