package com.example.complainsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;


public class DashboardActivity extends AppCompatActivity {

    CardView cdintro;
    CardView cdacctsetting;
    CardView cdmakecomplaint;
    CardView cdcomplainthistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setTitle(R.string.title_dashboard);

        cdintro = (CardView) findViewById(R.id.cdintro);
        cdacctsetting = (CardView) findViewById(R.id.cdacctsetting);
        cdmakecomplaint = (CardView) findViewById(R.id.cdmakecomplaint);
        cdcomplainthistory = (CardView) findViewById(R.id.cdcomplainthistory);

        cdintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introIntent = new Intent(DashboardActivity.this, IntroActivity.class);
                startActivity(introIntent);
            }
        });

        cdacctsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introIntent = new Intent(DashboardActivity.this, EditProfile.class);
                startActivity(introIntent);
            }
        });

        cdmakecomplaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introIntent = new Intent(DashboardActivity.this, ComplaintActivity.class);
                startActivity(introIntent);
            }
        });

        cdcomplainthistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Requires administrative priviledges..Sorry", Snackbar.LENGTH_LONG).show();
//                Intent introIntent = new Intent(DashboardActivity.this, ComplaintHistory.class);
//                startActivity(introIntent);
            }
        });
    }
}
