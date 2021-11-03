package com.example.bloodo_.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bloodo_.R;

public class LoginActivity extends AppCompatActivity {

    private AppCompatButton facebookBtn;
    private AppCompatButton googleBtn;
    private AppCompatButton mobileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        facebookBtn = (AppCompatButton) findViewById(R.id.loginFacebook);
        googleBtn = (AppCompatButton) findViewById(R.id.loginGoogle);
        mobileBtn = (AppCompatButton) findViewById(R.id.loginMobile);

        facebookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                finish();
            }
        });

        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                finish();
            }
        });

        mobileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MobileLogin.class));
            }
        });
    }
}