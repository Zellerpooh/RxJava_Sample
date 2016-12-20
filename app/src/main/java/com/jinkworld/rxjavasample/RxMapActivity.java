package com.jinkworld.rxjavasample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

public class RxMapActivity extends AppCompatActivity {
    private Integer[] number = {1, 2, 3, 4, 5, 6};
    @BindView(R.id.text2)
    TextView text2;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.activity_rx_map)
    LinearLayout activityRxMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_map);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onClick() {
        start();
    }

    private void start() {
//        text2.append("\n 输入参数： 1,2,3,4,5,6 \n");
//        Observable.from(number).map(new Func1<Integer, Boolean>() {
//            @Override
//            public Boolean call(Integer integer) {
//                text2.append("\n\n map()  Integer--->Boolean");
//                return (integer < 3);
//            }
//        }).subscribe(new Action1<Boolean>() {
//            @Override
//            public void call(Boolean aBoolean) {
//                text2.setText("观察到得结果" + aBoolean + "\n");
//            }
//        });
        Subscriber<Boolean> subscriber = new Subscriber<Boolean>() {
            @Override
            public void onCompleted() {
                text2.append("订阅完成");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Boolean aBoolean) {
                text2.append(aBoolean.toString() + "\n");
            }


        };
        Observable.from(number).map(new Func1<Integer, Boolean>() {
            @Override
            public Boolean call(Integer integer) {
                return integer > 3;
            }
        }).subscribe(subscriber);
    }
}
