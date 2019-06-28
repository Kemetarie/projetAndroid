package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.model.APIService;
import com.example.myapplication.model.Entity.Client;
import com.example.myapplication.model.adapter.ClientAdapter;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ClientAdapter adapter = new ClientAdapter(APIService.getClients());
        RecyclerView recyclerView = findViewById(R.id.client_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        try {
            APIService.getAllClients(new APIService.OnDownloadAllClientListener() {
                @Override
                public void onAllClientDownloaded(final List<Client> clients) {
                    adapter.setListClient(clients);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                            adapter.notifyDataSetChanged();
                        }
                    });
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onClickGoToAddClient(View v)
    {
        Intent addClientActivity = new Intent(this, AddClient.class);
        startActivity(addClientActivity);
    }
}
