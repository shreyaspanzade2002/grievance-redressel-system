package com.example.complainsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        setTitle(R.string.title_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
