package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Agency {

    @SerializedName("id")
    private int id;
    @SerializedName("login")
    private String login;
    @SerializedName("password")
    private String password;

    public Agency(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
