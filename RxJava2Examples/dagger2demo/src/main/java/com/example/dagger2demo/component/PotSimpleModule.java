package com.example.dagger2demo.component;

import com.example.dagger2demo.MainActivity;

import dagger.Module;

/**
 * @Function
 * @Data 2017/10/20
 * @Author daixiansen
 */

@Module
public class PotSimpleModule {

    private MainActivity activity;

    public PotSimpleModule(MainActivity activity) {
        this.activity = activity;
    }

//
//    @Provides
//    public Pot getPot(){
//        return new Pot();
//    }
}
