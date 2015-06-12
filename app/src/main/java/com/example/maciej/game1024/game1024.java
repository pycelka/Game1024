package com.example.maciej.game1024;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Maciej on 2015-06-12.
 */
public class game1024 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "JOu4vKYbjbhlBkbGw8MT8uiVby0CGbYqIq5ruJoi", "q9xxaIQUUnnU1tbGT5DzA7gCiv10kaAkjBHJ07Q7");

    }
}
