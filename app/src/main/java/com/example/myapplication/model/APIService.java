package com.example.myapplication.model;

import android.util.Log;

import com.example.myapplication.MainActivity;
import com.example.myapplication.model.Entity.Client;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class APIService {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private static final String BASE_URL = "https://projetandroid-c3605.firebaseio.com";
    private static final String CLIENT_URL = BASE_URL + "/clients.json";
    private static final String TAG = MainActivity.class.getName();
    private OnDownloadAllClientListener listener;

    private static List<Client> clients = new ArrayList<>();

    public static void getAllClients(final OnDownloadAllClientListener listener) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(CLIENT_URL)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                APIService apiService = new APIService();
                String json = response.body().string();
                Type typeTransform = new TypeToken<Map<String, Client>>(){}.getType();
                Map<String, Client> clients = new Gson().fromJson(json, typeTransform);

                for(Map.Entry<String,Client> client : clients.entrySet()){
                    client.getValue().setId(client.getKey());
                }

                apiService.setClients(new ArrayList<>(clients.values()));
                listener.onAllClientDownloaded(getClients());
                Log.e(TAG, clients.toString());
                Log.e(TAG, "onResponse: " + json);
            }
        });
    }

    public static void postClient(Client client)
    {
        OkHttpClient okHttpClient = new OkHttpClient();

        Gson gson = new Gson();
        String json = gson.toJson(client);

        RequestBody requestBody = RequestBody.create(JSON, json);

        Request request = new Request.Builder()
                .url(CLIENT_URL)
                .post(requestBody)
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {

            }
        });
    }

    public static List<Client> getClients() {
        return clients;
    }

    private void setClients(List<Client> clients) {
        APIService.clients = clients;
    }

    public interface OnDownloadAllClientListener{
        void onAllClientDownloaded(List<Client> clients);
    }
}
