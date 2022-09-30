package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.Toolbar;

import com.example.chatapp.databinding.ActivityHomeBinding;

public class home extends AppCompatActivity {

    ActivityHomeBinding binding;
    private Toolbar mtoolbar;
    private ViewPager myviewpager;
    private TabLayout mytablayout;
    private TabsAccessorAdapter myTabsAccessorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        replacefragment(new ChatFragment());

       mtoolbar=(Toolbar) findViewById(R.id.action_bar);
       setSupportActionBar(mtoolbar);

    }


    private void replacefragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }
}