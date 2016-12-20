package com.jinkworld.rxjavasample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jinkworld.rxjavasample.conversion.RxFlatMapActivity;
import com.jinkworld.rxjavasample.retrofit.activity.HomeActivity;
import com.jinkworld.rxjavasample.scheduler.SimpleExampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void normalRxActivity(View view) {
        Intent intent = new Intent(this, NormalRxActivity.class);
        startActivity(intent);
    }

    public void rxMapActivity(View view) {
        Intent intent = new Intent(this, RxMapActivity.class);
        startActivity(intent);
    }

    public void retrofitandrx(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void scheduler(View view) {
        Intent intent = new Intent(this, SimpleExampleActivity.class);
        startActivity(intent);
    }

    public void conversion(View view) {
        Intent intent = new Intent(this, RxFlatMapActivity.class);
        startActivity(intent);
    }
}
