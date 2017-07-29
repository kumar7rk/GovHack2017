package com.geeky7.rohit.govhack2017;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        Intent intent = new Intent(this,MapsActivity.class);
        Thread.sleep(1000);
        startActivity(intent);
        finish();
    }

}