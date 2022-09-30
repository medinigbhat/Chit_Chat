package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class help_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);
        getSupportActionBar().setTitle("HELP");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}