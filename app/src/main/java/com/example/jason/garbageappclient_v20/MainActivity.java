package com.example.jason.garbageappclient_v20;

/**
 * Created by jason on 03-Feb-18.
 */

import android.content.Intent;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Initial Screen of the app
 * Created by jason on 03-Feb-18.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
    public void garbFullBtn(){
        Intent qr = new Intent(this, qrActivity.class);
        startActivity(qr);

    }
}
