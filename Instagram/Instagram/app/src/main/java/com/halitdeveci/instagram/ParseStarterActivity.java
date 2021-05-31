package com.halitdeveci.instagram;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VxS2ltykVj5seLlVRq2SGbd0gh7gmxJYNYdF4Av2")
                .clientKey("NpGavZkr6tbMW0fw4bSDUzN7MhxbWgpkX8b8Ps0x")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
