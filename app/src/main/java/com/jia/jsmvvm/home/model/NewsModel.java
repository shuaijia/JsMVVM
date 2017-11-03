package com.jia.jsmvvm.home.model;

import com.jia.jsmvvm.home.viewmodel.News;
import com.jia.jsmvvm.net.HttpMethod;

import rx.Subscriber;

/**
 * Description: 新闻网络请求model
 * Created by jia on 2017/11/3.
 * 人之所以能，是相信能
 */
public class NewsModel {

    public void getNews(final OnCallBack onCallBack) {
        HttpMethod.getInstance().getNews(new Subscriber<News>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                onCallBack.onFaile(e.toString());
            }

            @Override
            public void onNext(News news) {
                onCallBack.onSuccess(news);
            }
        });
    }


    public interface OnCallBack {
        void onSuccess(News news);

        void onFaile(String errorInfo);
    }
}
