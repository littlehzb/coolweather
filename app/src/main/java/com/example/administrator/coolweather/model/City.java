package com.example.administrator.coolweather.model;

/**
 * Created by Administrator on 2016/6/29.
 */
public class City {
    private int id;
    private String cityNmae;
    private String cityCode;
    private int provinceId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityNmae(String cityNmae) {
        this.cityNmae = cityNmae;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public String getCityNmae() {
        return cityNmae;
    }

    public String getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
