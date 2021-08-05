package com.example.complainsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    CardView intrdctn;
    CardView acctSetting;
    CardView complaintHstry;
    CardView makeComplnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        intrdctn = findViewById(R.id.intrdctn);
        acctSetting = findViewById(R.id.acctSetting);
        complaintHstry = findViewById(R.id.complaintHstry);
        makeComplnt = findViewById(R.id.makeComplnt);

        intrdctn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introIntent = new Intent(getApplicationContext(), IntroActivity.class);
                startActivity(introIntent);
            }
        });

        acctSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introIntent = new Intent(getApplicationContext(), IntroActivity.class);
                startActivity(introIntent);
            }
        });

        complaintHstry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introIntent = new Intent(getApplicationContext(), IntroActivity.class);
                startActivity(introIntent);
            }
        });

        makeComplnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introIntent = new Intent(getApplicationContext(), IntroActivity.class);
                startActivity(introIntent);
            }
        });
    }
}
