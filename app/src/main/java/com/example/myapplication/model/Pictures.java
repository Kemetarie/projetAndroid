package com.example.myapplication.model;

public class Pictures {

    private Car car;
    private String url;

    public Pictures(Car car, String url) {
        this.car = car;
        this.url = url;
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
