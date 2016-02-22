package com.melanie.ideal;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.Toast;

import com.example.melanie.ideal.R;

public class Yogurtland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogurtland);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ImageView coupon = (ImageView) findViewById(R.id.coupon);

        Button getCoupon = (Button) findViewById(R.id.getcoupon);
        getCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coupon.setVisibility(View.VISIBLE);
                coupon.setImageResource(R.drawable.yogurtlandcoupon);
            }
        });
    }

}
