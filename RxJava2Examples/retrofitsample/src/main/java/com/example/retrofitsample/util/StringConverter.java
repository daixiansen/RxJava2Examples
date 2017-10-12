package com.example.retrofitsample.util;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * @Function 自定义内容解析器
 * @Data 2017/10/11
 * @Author daixiansen
 */

public class StringConverter implements Converter<ResponseBody, String> {
    public static final StringConverter INSTANCE = new StringConverter();

    @Override
    public String convert(@NonNull ResponseBody value) throws IOException {
        return value.string();
    }
}
