package com.example.publicplassapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickRumahsakit(View view) {

        //gambar Rumah Sakit di Click
        Intent intent = new Intent(this,RumahSakit.class);
        startActivity(intent);
    }
}