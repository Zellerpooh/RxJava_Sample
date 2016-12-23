package com.jinkworld.rxjavasample.conversion;

import android.nfc.Tag;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;
import com.jinkworld.rxjavasample.R;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

public class RxFlatMapActivity extends AppCompatActivity {
    private static final String TAG = "RxFlatMapActivity";

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.btn_start)
    Button btnStart;
    @BindView(R.id.flat_map)
    Button flatMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_flat_map);
        ButterKnife.bind(this);
        students = new Student[5];
        for (int i = 0; i < 5; i++) {

            courses = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                courses.add(new Student.Course("course" + j));
            }
            Student student = new Student("student" + i, courses);
            students[i] = student;
        }
        RxView.clicks(flatMap).throttleFirst(1000, TimeUnit.MICROSECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                actionFlatmap();
            }
        });
    }

    private List<Student.Course> courses;
    private Student[] students;
    private StringBuilder sb;

    @OnClick({R.id.btn_start, R.id.flat_map})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_start:
                actionMap();
                break;

        }
    }


    private void actionMap() {
        //打印学生的名字
//        Subscriber<String> subscriber = new Subscriber<String>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(String s) {
//                Log.d(TAG, "onNext: "+s);
//            }
//        };
//        Observable.from(students).map(new Func1<Student, String>() {
//            @Override
//            public String call(Student student) {
//
//                return student.getName();
//            }
//        }).subscribe(subscriber);
        //打印每一名学生的课程(Map)
        Subscriber<Student> subscriber = new Subscriber<Student>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Student student) {
                List<Student.Course> coureses = student.getCourses();
                for (Student.Course c : coureses) {
                    Log.d(TAG, "onNext:" + student.getName() + "-" + c.getCourseName());
                }
            }
        };
        Observable.from(students).subscribe(subscriber);

    }

    private void actionFlatmap() {
        //打印每一名学生的课程(flatMap)
        Subscriber<Student.Course> subscriber = new Subscriber<Student.Course>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Student.Course course) {
                Log.d(TAG, "onNext:" + course.getCourseName());
            }
        };
        Observable.from(students).flatMap(new Func1<Student, Observable<Student.Course>>() {
            @Override
            public Observable<Student.Course> call(Student student) {
                return Observable.from(student.getCourses());
            }
        }).subscribe(subscriber);
    }
}
