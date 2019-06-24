package com.example.myapplication.model;

import java.util.Date;

public class Leasing {
    private int id;
    private Client client;
    private Car car;
    private Date startDate;
    private Date endDate;
    private String beforePicture;
    private String afterPicture;
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
