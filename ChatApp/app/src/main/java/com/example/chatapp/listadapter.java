package com.example.chatapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class listadapter extends ArrayAdapter<user> {

    public listadapter(Context context, ArrayList<user> userArrayList){
        super(context,R.layout.chats_view,userArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        user user= getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.chats_view,parent,false);
        }
        ImageView imageView=convertView.findViewById(R.id.pfp);
        TextView name=convertView.findViewById(R.id.personname);
        TextView lastmsg=convertView.findViewById(R.id.lastmsg);
        TextView time=convertView.findViewById(R.id.time);

        imageView.setImageResource(user.imgid);
        name.setText(user.username);
        lastmsg.setText(user.lastmsg);
        time.setText(user.time);

        return super.getView(position, convertView, parent);
    }
}
