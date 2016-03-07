package com.melanie.ideal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.melanie.ideal.R;

public class Peets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peets);

        final ImageView coupon = (ImageView) findViewById(R.id.coupon);

        Button getCoupon = (Button) findViewById(R.id.getcoupon);
        getCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coupon.setVisibility(View.VISIBLE);
                coupon.setImageResource(R.drawable.peetscoupon);
            }
        });
    }

}
