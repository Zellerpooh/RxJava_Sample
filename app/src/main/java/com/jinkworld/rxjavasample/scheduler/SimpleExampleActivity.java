package com.jinkworld.rxjavasample.scheduler;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.jinkworld.rxjavasample.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Zellerpooh on 16/12/20.
 */

public class SimpleExampleActivity extends Activity {
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.btn_display)
    Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_display)
    public void onClick() {
        displayImage();
    }

    private void displayImage() {
        Observable.create(new Observable.OnSubscribe<Drawable>() {
            @Override
            public void call(Subscriber<? super Drawable> subscriber) {
                Log.d("observable-thread:", Thread.currentThread().getName());
                Drawable drawable = getTheme().getDrawable(R.mipmap.ic_launcher);
                subscriber.onNext(drawable);
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
                new Subscriber<Drawable>() {
                    @Override
                    public void onCompleted() {
                        Log.d("subscribe-completed-thread:", Thread.currentThread().getName());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(SimpleExampleActivity.this, "onError", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(Drawable drawable) {
                        Log.d("subscribe-thread:", Thread.currentThread().getName());
                        imageView.setImageDrawable(drawable);
                    }
                }
        );
    }
}
