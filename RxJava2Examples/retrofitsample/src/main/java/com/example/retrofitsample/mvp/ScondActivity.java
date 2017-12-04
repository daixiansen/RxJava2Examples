package com.example.retrofitsample.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.retrofitsample.R;
import com.example.retrofitsample.bean.VoiceBean;

public class ScondActivity extends AppCompatActivity implements ScondView {

    private VoiceBean mVoiceBean;
    private ScondPresenter mScondPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);
        mScondPresenter = new ScondPresenter(this);
        findViewById(R.id.bt_requst).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mScondPresenter.getData();
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
