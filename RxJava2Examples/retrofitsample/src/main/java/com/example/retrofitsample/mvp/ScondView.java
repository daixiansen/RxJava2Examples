package com.example.retrofitsample.mvp;

import com.example.retrofitsample.bean.VoiceBean;

/**
 * Description ${TODO}
 * Author daixiansen
 * Date   2017/11/2 18:43
 **/

public interface ScondView {
    void onRespose(VoiceBean voiceBean);

    void showLoading();

    void dismissLoading();
}
