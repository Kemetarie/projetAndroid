package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.model.APIService;
import com.example.myapplication.model.Entity.Client;

public class AddClient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_client);
    }

    public void onAddClientClicked(View v)
    {
        EditText editName = findViewById(R.id.new_client_name);
        EditText editSurname = findViewById(R.id.new_client_surname);
        EditText editAddress = findViewById(R.id.new_client_address);

        String name = editName.getText().toString();
        String surname = editSurname.getText().toString();
        String address = editAddress.getText().toString();

        Client client = new Client(name, surname, address);

        APIService.postClient(client);

        Intent maintActivity = new Intent(this, MainActivity.class);
        startActivity(maintActivity);
    }
}
