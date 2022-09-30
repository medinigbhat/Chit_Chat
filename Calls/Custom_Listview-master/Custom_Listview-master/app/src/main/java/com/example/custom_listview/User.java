package com.example.custom_listview;

public class User {
    String name, lastMsgTime;
    int imageId;
    int call;

    public User(String name, String lastMsgTime, int imageId,int call) {
        this.name = name;
        this.call=call;
        this.lastMsgTime = lastMsgTime;
        this.imageId = imageId;
    }
}
