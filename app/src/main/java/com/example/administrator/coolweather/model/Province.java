package com.example.administrator.coolweather.model;

/**
 * Created by Administrator on 2016/6/29.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }
}
