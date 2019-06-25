package com.example.myapplication.model;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("/clients.json")
    Call<ClientResponse> getAllClients();
}
