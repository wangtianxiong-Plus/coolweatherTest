package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wtx on 2019/8/31.
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
