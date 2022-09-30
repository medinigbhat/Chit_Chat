package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profilepage extends AppCompatActivity {
    Button home;
    Button logout;
    Button help;
    Button themes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_profilepage);
        home=findViewById(R.id.home);
        logout=findViewById(R.id.logout);
        help=findViewById(R.id.help);
        themes=findViewById(R.id.Themes);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home=new Intent(Profilepage.this,MainActivity.class);
                startActivity(home);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout=new Intent(Profilepage.this,MainActivity.class);
                startActivity(logout);
            }
        });
        themes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent themes=new Intent(Profilepage.this,themespage.class);
                startActivity(themes);

            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent help=new Intent(Profilepage.this,help_page.class);
                startActivity(help);

            }
        });

    }

}