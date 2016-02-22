package com.melanie.ideal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.example.melanie.ideal.R;

public class Deals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deals);

        //Action Bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Deals");

        ImageButton yogurtland = (ImageButton) findViewById(R.id.yogurtland);
        yogurtland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Deals.this, Yogurtland.class));
            }
        });

        ImageButton bjs = (ImageButton) findViewById(R.id.bjs);
        bjs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Deals.this, BJs.class));
            }
        });

        ImageButton viewmaster = (ImageButton) findViewById(R.id.viewmaster);
        viewmaster.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Deals.this, ViewMaster.class));
            }
        });

    }
}
