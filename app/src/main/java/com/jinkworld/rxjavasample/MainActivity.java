package com.jinkworld.rxjavasample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
    public void rxMapActivity(View view){
        Intent intent=new Intent(this,RxMapActivity.class);
        startActivity(intent);
    }
    public void retrofitandrx(View view){

    }
}
