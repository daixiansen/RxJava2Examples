package com.example.retrofitsample.mvp;

import com.example.retrofitsample.bean.VoiceBean;

/**
 * Description ${TODO}
 * Author daixiansen
 * Date   2017/11/2 18:43
 **/

public class ScondPresenter implements ScondEngine.CallBack {
    private final ScondView mScondView;
    private ScondEngine scondEngine;

    public ScondPresenter(ScondView scondView) {
        this.mScondView = scondView;
    }

    public void getData() {
        if (scondEngine == null) {
            scondEngine = new ScondEngine(this);
        }
        scondEngine.getData();
    }

    @Override
    public void onRespose(VoiceBean voiceBean) {
        if(mScondView != null){
            mScondView.onRespose(voiceBean);
        }
    }
}
