package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


import com.example.custom_listview.databinding.ActivityMainBinding;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
                R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i};
        String[] name = {"Roy","Jerry","Naina","Rahul","Pooja","Aasim","Yash","Nidhi","Alpha"};
        String[] lastmsgTime = {"8:45 pm","9:00 am","7:34 pm","6:32 am","5:76 am",
                "5:00 am","7:34 pm","2:32 am","7:76 am"};
        int[] call={R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_24,};


        ArrayList<User> userArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){

            User user = new User(name[i],lastmsgTime[i],imageId[i],call[i]);
            userArrayList.add(user);

        }


       ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);

       binding.listview.setAdapter(listAdapter);
      binding.listview.setClickable(true);
    }
}