package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Picture {

    @SerializedName("id")
    private int id;
    @SerializedName("car_id")
    private Car car;
    @SerializedName("url")
    private String url;

    public Picture(int id, Car car, String url) {
        this.id = id;
        this.car = car;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Pictures{" +
                "car=" + car +
                ", url='" + url + '\'' +
                '}';
    }
}
