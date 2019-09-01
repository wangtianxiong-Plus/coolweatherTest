package com.coolweather.android.gson;

/**
 * Created by wtx on 2019/8/31.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
