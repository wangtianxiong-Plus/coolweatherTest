package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wtx on 2019/8/20.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int weatherId;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }
}
