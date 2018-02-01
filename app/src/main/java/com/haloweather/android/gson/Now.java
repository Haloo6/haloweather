package com.haloweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/2/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
