package com.example.bloodo_.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.example.bloodo_.Data.LauncherManager;
import com.example.bloodo_.R;

public class SplashActivity extends AppCompatActivity {

    LauncherManager launcherManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        launcherManager = new LauncherManager(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(launcherManager.isFirstTime()){
                    launcherManager.setFirstLaunch(false);
                    startActivity(new Intent(getApplicationContext(), SliderActivity.class));
                }else {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }
            }
        }, 2000);
    }
}