package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chatapp.databinding.ActivityRegistrationpageBinding;

public class registrationpage extends AppCompatActivity {
    EditText pass;
    EditText confpass;
    Button signupbtn;
    EditText fullname;
    EditText username;
    EditText phno;
    ActivityRegistrationpageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegistrationpageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        signupbtn= (Button)findViewById(R.id.signupp);
        fullname=(EditText)findViewById(R.id.fullname);
        username=(EditText)findViewById(R.id.username);
        phno=(EditText)findViewById(R.id.phno);
        pass=(EditText)findViewById(R.id.pass);
        confpass=(EditText)findViewById(R.id.confpass);
        signupbtn.setOnClickListener(new View.OnClickListener() {
            String fn=fullname.getText().toString();
            String un=username.getText().toString();
            String ph=phno.getText().toString();
            String p=pass.getText().toString();
            String cp=confpass.getText().toString();
            @Override
            public void onClick(View view) {
//                if (TextUtils.isEmpty(fn) || TextUtils.isEmpty(un) || TextUtils.isEmpty(ph) || TextUtils.isEmpty(p) || TextUtils.isEmpty(cp)){
//                    Toast.makeText(registrationpage.this, "Credentials Missing", Toast.LENGTH_SHORT).show();
//                }
//                else if(ph.length()!=9) {
//                    Toast.makeText(registrationpage.this, "Enter 10 digit phone no.", Toast.LENGTH_SHORT).show();
//                }
//                else
                startActivity(new Intent(registrationpage.this, MainActivity.class));

            }
        });
    }
}