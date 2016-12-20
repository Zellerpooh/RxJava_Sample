package com.jinkworld.rxjavasample.retrofit.http;


import com.jinkworld.rxjavasample.retrofit.entity.DriverDetailModel;
import com.jinkworld.rxjavasample.retrofit.entity.HttpResult;
import com.jinkworld.rxjavasample.retrofit.entity.MovieEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Zellerpooh on 16/10/20.
 */

public interface MovieService {
    @GET("top250")
    Observable<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);

    @POST("user/login")
    Observable<HttpResult> login(@Query("name") String username, @Query("password") String password);

    @POST("user/getDriverDetail")
    Observable<HttpResult<DriverDetailModel>> getDriverDetail();
}
