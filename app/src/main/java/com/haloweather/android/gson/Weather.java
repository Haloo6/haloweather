package com.haloweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 2018/2/1.
 */

public class Weather {
    public String status;  //成功返回ok,失败会返回具体原因
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList; //使用集合类型，因为daily_forecast包含的是一个数组
}
