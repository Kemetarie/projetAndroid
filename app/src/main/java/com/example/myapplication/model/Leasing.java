package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Leasing {
    @SerializedName("id")
    private int id;
    @SerializedName("client_id")
    private Client client;
    @SerializedName("car_id")
    private Car car;
    @SerializedName("start_date")
    private Date startDate;
    @SerializedName("end_date")
    private Date endDate;
    @SerializedName("before_picture")
    private String beforePicture;
    @SerializedName("after_picture")
    private String afterPicture;
    @SerializedName("returned")
    private boolean returned;

    public Leasing(int id, Client client, Car car, Date startDate, Date endDate, String beforePicture, String afterPicture, boolean returned) {
        this.id = id;
        this.client = client;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.beforePicture = beforePicture;
        this.afterPicture = afterPicture;
        this.returned = returned;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getBeforePicture() {
        return beforePicture;
    }

    public void setBeforePicture(String beforePicture) {
        this.beforePicture = beforePicture;
    }

    public String getAfterPicture() {
        return afterPicture;
    }

    public void setAfterPicture(String afterPicture) {
        this.afterPicture = afterPicture;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "Leasing{" +
                "id=" + id +
                ", client=" + client +
                ", car=" + car +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", beforePicture='" + beforePicture + '\'' +
                ", afterPicture='" + afterPicture + '\'' +
                ", returned=" + returned +
                '}';
    }
}
