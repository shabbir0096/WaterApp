package com.example.waterapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    boolean userLogin;
    String userType;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        preferences = getSharedPreferences("loginSession", MODE_PRIVATE);
        userLogin = preferences.getBoolean("userLogin", false);
         userType  = preferences.getString("userType" , "");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent;
//                if (userLogin) {
                    intent = new Intent(SplashScreenActivity.this, SignInActivity.class);
//                } else if (userType.equals("student")) {
//                    intent = new Intent(SplashScreenActivity.this, DashboardActivity.class);
//                }
//                else {
//                    intent = new Intent(SplashScreenActivity.this, DashboardActivity.class);
//                }
                startActivity(intent);
                finish();

            }

        }, 3000);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
