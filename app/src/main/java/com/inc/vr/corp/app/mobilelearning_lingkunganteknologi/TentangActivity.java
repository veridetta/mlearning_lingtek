package com.inc.vr.corp.app.mobilelearning_lingkunganteknologi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class TentangActivity extends AppCompatActivity {
    CardView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        home = findViewById(R.id.btn_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TentangActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}