package com.example.myapplication.model;

public class Car {

    private int id;
    private boolean isStored;
    private int dailyPrice;
    private String plate;
    private Agency agency;

    public Car(int id, boolean isStored, int dailyPrice, String plate, Agency agency) {
        this.id = id;
        this.isStored = isStored;
        this.dailyPrice = dailyPrice;
        this.plate = plate;
        this.agency = agency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStored() {
        return isStored;
    }

    public void setStored(boolean stored) {
        isStored = stored;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", isStored=" + isStored +
                ", dailyPrice=" + dailyPrice +
                ", plate='" + plate + '\'' +
                ", agency=" + agency +
                '}';
    }
}
