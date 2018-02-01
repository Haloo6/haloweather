package com.haloweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/2/1.
 */

public class Basic {
    @SerializedName("city") //使用 @SerializedName注解的方式，让JSON字段和java字段建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
