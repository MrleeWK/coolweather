package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    /**
     * @SerializedName注解方式让JSONz字段与Java字段之间建立关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
