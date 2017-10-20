package com.example.dagger2demo.bean;

import javax.inject.Inject;

/**
 * @Function
 * @Data 2017/10/20
 * @Author daixiansen
 */

public class Pot {

    private String pot;

    @Inject
    public Pot(String pot) {
        this.pot = pot;
    }

    public String getField() {
        return pot;
    }
}
