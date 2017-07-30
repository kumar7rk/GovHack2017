package com.geeky7.rohit.govhack2017;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;

public class MainActivity extends Activity {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button guest = (Button)findViewById(R.id.guest);
        Button host = (Button)findViewById(R.id.host);
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        host.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}