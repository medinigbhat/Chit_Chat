package com.example.chatapp;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {
    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                ChatFragment chatFragment=new ChatFragment();
                return chatFragment;
            case 1:
                StatusFragment statusFragment=new StatusFragment();
                return statusFragment;
            case 2:
                CallsFragment callsFragment=new CallsFragment();
                return callsFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @androidx.annotation.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Chats";
            case 1:
                return "Status";
            case 21:
                return "Calls";
            default:
                return null;
        }

    }
}
