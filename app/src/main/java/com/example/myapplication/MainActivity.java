package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.model.APIService;
import com.example.myapplication.model.Client;
import com.example.myapplication.model.ClientResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    public static final String BASE_URL = "https://projetandroid-c3605.firebaseio.com";
    private static Retrofit retrofit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectAndGetApiData();
    }

    public void connectAndGetApiData(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        APIService apiService = retrofit.create(APIService.class);
        Call<ClientResponse> call = apiService.getAllClients();
        call.enqueue(new Callback<ClientResponse>() {
            @Override
            public void onResponse(Call<ClientResponse> call, Response<ClientResponse> response) {
                Map<String, Client> clients = response.body().getDatas();
                Log.d(TAG, "Number of clients received: " + clients.size());
                for(Client client : clients.values())
                {
                    Log.d(TAG, "Client Name: " + client.getName());
                    Log.d(TAG, "Client Surname: " + client.getSurname());
                    Log.d(TAG, "Client Address: " + client.getAddress());
                }
            }

            @Override
            public void onFailure(Call<ClientResponse> call, Throwable t) {
                Log.e(TAG, "Mon cul" + t.toString());
            }
        });
    }
}
