package com.example.bloodo_.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.bloodo_.R;

public class DonorListActivity extends AppCompatActivity {

    DrawerLayout donorDrawerLayout;
    AppCompatButton backBtn;
    AppCompatButton mapBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_list);

        donorDrawerLayout = findViewById(R.id.donorDonorLayout);
        backBtn = findViewById(R.id.donorBackBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DonorListActivity.this, HomeActivity.class));
                finish();
            }
        });

        mapBtn = findViewById(R.id.donorMapBtn);
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DonorListActivity.this, MapActivity.class));
            }
        });
    }

}