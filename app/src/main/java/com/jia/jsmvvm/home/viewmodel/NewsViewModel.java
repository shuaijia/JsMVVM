package com.jia.jsmvvm.home.viewmodel;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jia.jsmvvm.databinding.ActivityMainBinding;
import com.jia.jsmvvm.home.model.NewsModel;

/**
 * Description: 新闻ViewModel类
 * Created by jia on 2017/11/3.
 * 人之所以能，是相信能
 */
public class NewsViewModel {

    public Activity activity;

    public ActivityMainBinding activityMainBinding;

    public NewslistBean news;

    public NewsModel model;

    private int num=1;

    public NewsViewModel(Activity activity, final ActivityMainBinding activityMainBinding) {
        this.activity = activity;
        this.activityMainBinding = activityMainBinding;

        model=new NewsModel();

        model.getNews(new NewsModel.OnCallBack() {
            @Override
            public void onSuccess(News news) {
                activityMainBinding.setNews(news.getNewslist().get(0));
            }

            @Override
            public void onFaile(String errorInfo) {
                news=new NewslistBean("error","error","error","error","error");
                activityMainBinding.setNews(news);
            }
        });
    }

}
