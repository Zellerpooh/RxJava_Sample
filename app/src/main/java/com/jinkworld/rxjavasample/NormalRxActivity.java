package com.jinkworld.rxjavasample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;

public class NormalRxActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "NormalRxActivity";
    static String str = "一二三四五\n 上山打老虎\n 老虎一发威\n 武松就发怵\n";
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.activity_normal_rx)
    LinearLayout activityNormalRx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_rx);
        ButterKnife.bind(this);
//        editText = (EditText) findViewById(R.id.editText);
//        textView = (TextView) findViewById(R.id.textView);
//        button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(this);
        editText.setText(str);
    }


    @Override
    @OnClick({R.id.textView, R.id.editText, R.id.button})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textView:
                break;
            case R.id.editText:
                break;
            case R.id.button:
                Log.i(TAG, "btn");
                if (textView.getText().toString() != null || textView.getText().toString().length() > 0) {
                    textView.setText("");
                }
                start();
                break;
        }
    }

    private void start() {
        Observable observable = createObservable();
        Subscriber subscriber = createSubscriber();

        textView.append("开始订阅,准备观察。。。\n");
        observable.subscribe(subscriber);
        //事实上，observable不止可以订阅subscriber，也可以订阅ActionX()
        //就像现在这样
//        observable.subscribe(new Action1<String>() {
//            @Override
//            public void call(String s) {
//                //Action1也就意味着，只能传入一个参数 ----> String s,同理Action0，Action2....,
//                //在这个call方法中传入了onNext()的参数，相当于代替了onNext方法，但是就不能监听onComplete,onError方法了
//                mText.append("执行观察者中的onNext()...\n");
//                mText.append(s+"...\n");
//            }
//        });
    }

    //创建观察者
    public Subscriber createSubscriber() {
        Subscriber subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                textView.append("执行观察者中的onComplete()...\n");
                textView.append("订阅完毕,结束观察...\n");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                textView.append("执行观察者中的onNext()...\n");
                textView.append(s + "...\n");
            }


        };
        return subscriber;
    }

    //创建被观察者
    public Observable createObservable() {
        Observable observable = Observable.create(new Observable.OnSubscribe<String>() {

            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("一二三四五");
                subscriber.onNext("上山打老虎");
                subscriber.onNext("老虎一发威");
                subscriber.onNext("武松就发怵");
                subscriber.onCompleted();
            }
        });
        //想要图方便，可以这样创建
        //from(T[])
//        String [] kk={"一二三四五","上山打老虎","老虎一发威","武松就发怵"};
//        Observable observable=Observable.from(kk);

        //或者这样
        //just(T...)
//        Observable observable=Observable.just("一二三四五","上山打老虎","老虎一发威","武松就发怵");
        return observable;
    }
}
