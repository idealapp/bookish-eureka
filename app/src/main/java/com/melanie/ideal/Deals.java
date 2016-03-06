package com.melanie.ideal;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.melanie.ideal.R;

public class Deals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deals);

        LinearLayout titlebar_ll = (LinearLayout) findViewById(R.id.ideal_titlebar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.titlebar);

        //Deals
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
