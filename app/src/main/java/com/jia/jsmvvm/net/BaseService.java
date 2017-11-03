package com.jia.jsmvvm.net;

import com.jia.jsmvvm.home.viewmodel.News;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Describtion:
 * Created by jia on 2017/6/6.
 * 人之所以能，是相信能
 */
public interface BaseService {

    @POST("it")
    Observable<News> getNews(@Query("key")String key,@Query("num")String num);
}
