package com.example.instagramclone;

import android.app.Application;

import com.example.instagramclone.ui.login.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZXmLnmRi6TXlTBjJYebuwhtBlC2WOMLH8k8P9vRI")
                .clientKey("wM5OdV5VCdUWwlDja8qpN3yikKGEq4ngrp8wedMT")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
