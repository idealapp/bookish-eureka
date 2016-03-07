package com.melanie.ideal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.melanie.ideal.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView title = (ImageView) findViewById(R.id.header);

        ImageButton browse = (ImageButton) findViewById(R.id.browsebutton);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Deals.class));
            }
        });

        ImageButton clothes = (ImageButton) findViewById(R.id.clothesbutton);
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Deals.class));
            }
        });

        ImageButton food = (ImageButton) findViewById(R.id.foodbutton);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Food.class));
            }
        });

        ImageButton electronics = (ImageButton) findViewById(R.id.electronicsbutton);
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Deals.class));
            }
        });


        ImageButton entertainment = (ImageButton) findViewById(R.id.entertainmentbutton);
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Deals.class));
            }
        });

    }

}
