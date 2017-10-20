package com.example.dagger2demo.component;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

/**
 * @Function
 * @Data 2017/10/20
 * @Author daixiansen
 */

@Component(modules = PotSimpleModule.class)
public interface PotComponet {
    void inject(MainActivity activity);
}
