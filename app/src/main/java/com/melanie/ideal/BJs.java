package com.melanie.ideal;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.melanie.ideal.R;

public class BJs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bjs);

        final LinearLayout titlebar_ll = (LinearLayout) findViewById(R.id.ideal_titlebar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.titlebar);

        final ImageView coupon = (ImageView) findViewById(R.id.coupon);

        Button getCoupon = (Button) findViewById(R.id.getcoupon);
        getCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coupon.setVisibility(View.VISIBLE);
                coupon.setImageResource(R.drawable.bjscoupon);
            }
        });
    }
}
