package com.example.myapplication.model;

import java.util.Map;

public class ClientResponse {
    private Map<String, Client> datas;

    public ClientResponse(Map<String, Client> datas) {
        this.datas = datas;
    }

    public Map<String, Client> getDatas() {
        return datas;
    }
}
