package com.jinkworld.rxjavasample.retrofit.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.jinkworld.rxjavasample.R;
import com.jinkworld.rxjavasample.retrofit.entity.DriverDetailModel;
import com.jinkworld.rxjavasample.retrofit.entity.HttpResult;
import com.jinkworld.rxjavasample.retrofit.entity.MovieEntity;
import com.jinkworld.rxjavasample.retrofit.http.HttpMethods;
import com.jinkworld.rxjavasample.subscribers.ProgressSubscriber;
import com.jinkworld.rxjavasample.subscribers.SubscriberOnNextListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    @BindView(R.id.btn_getMovie)
    Button btnGetMovie;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.btn_getDriverDetail)
    Button btnGetDriverDetail;

    private Subscriber subscriber;
    private SubscriberOnNextListener getTopMovieOnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_getMovie)
    public void onClick() {
        login();
    }

    @OnClick(R.id.btn_getDriverDetail)
    public void getDriverDetail() {
//        getDetail();
//        getTopMovie();
    }

    private void getTopMovie() {
        getTopMovieOnNext = new SubscriberOnNextListener<MovieEntity>() {

            @Override
            public void onNext(MovieEntity movieEntity) {
                textView.setText(movieEntity.toString());
            }
        };
        HttpMethods.getInstance().getTopMovie(new ProgressSubscriber<MovieEntity>(getTopMovieOnNext, HomeActivity.this), 0, 10);

    }

    private void login() {
        subscriber = new Subscriber<HttpResult>() {
            @Override
            public void onCompleted() {
                Toast.makeText(HomeActivity.this, "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {
                textView.setText(e.getMessage());
            }

            @Override
            public void onNext(HttpResult httpResult) {
                textView.setText(httpResult.getResultMessage());
            }
        };
        HttpMethods.getInstance().login(subscriber, "15267110098", "123456");
    }

    private void getDetail() {

        getTopMovieOnNext = new SubscriberOnNextListener<DriverDetailModel>() {
            @Override
            public void onNext(DriverDetailModel detailModel) {
                textView.setText(detailModel.getRealName());
            }
        };
        HttpMethods.getInstance().getDriverDetail(new ProgressSubscriber<DriverDetailModel>(getTopMovieOnNext, HomeActivity.this));
    }

}
