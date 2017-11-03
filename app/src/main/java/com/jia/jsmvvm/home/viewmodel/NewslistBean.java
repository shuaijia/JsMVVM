package com.jia.jsmvvm.home.viewmodel;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jia.jsmvvm.BR;


/**
 * Description:
 * Created by jia on 2017/11/3.
 * 人之所以能，是相信能
 */
public class NewslistBean extends BaseObservable {
    /**
     * ctime : 2015-07-17
     * title : 那个抱走王明涵的，你上微信吗？看完这个你会心软吗？
     * description : 中国传统文化
     * picUrl : http://zxpic.gtimg.com/infonew/0/wechat_pics_-667708.jpg/640
     * url : http://mp.weixin.qq.com/s?__biz=MzA3OTg2NjEwNg==&amp;idx=5&amp;mid=209313388&amp;sn=7e30bd2851d22f69580e202c31fc7ecf
     */
//    public ObservableField<String> ctime=  new ObservableField<String>();
//    public ObservableField<String> title=  new ObservableField<String>();
//    public ObservableField<String> description=  new ObservableField<String>();
//    public ObservableField<String> picUrl=  new ObservableField<String>();
//    public ObservableField<String> url=  new ObservableField<String>();


    private String ctime;
    private String title;
    private String description;
    private String picUrl;
    private String url;

    public NewslistBean(String ctime, String title, String description, String picUrl, String url) {

    }

//    @Bindable
//    public String getCtime() {
//        return ctime.get();
//    }
//
//    public void setCtime(String ctime) {
//        this.ctime.set(ctime);
//        notifyPropertyChanged(BR.ctime);
//
//    }
//
//    @Bindable
//    public String getTitle() {
//        return title.get();
//    }
//
//    public void setTitle(String title) {
//        this.title.set(title);
//        notifyPropertyChanged(BR.title);
//    }
//
//    @Bindable
//    public String getDescription() {
//        return description.get();
//    }
//
//    public void setDescription(String description) {
//        this.description.set(description);
//        notifyPropertyChanged(BR.title);
//    }
//
//    @Bindable
//    public String getPicUrl() {
//        return picUrl.get();
//    }
//
//    public void setPicUrl(String picUrl) {
//        this.picUrl.set(picUrl);
//        notifyPropertyChanged(BR.picUrl);
//    }
//
//    @Bindable
//    public String getUrl() {
//        return url.get();
//    }
//
//    public void setUrl(String url) {
//        this.url.set(url);
//        notifyPropertyChanged(BR.url);
//    }


    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView imageView, String picUrl) {
        Glide.with(imageView.getContext())
                .load(picUrl)
                .into(imageView);
    }

    public void onItemClick(View pView) {
        Toast.makeText(pView.getContext(), title, Toast.LENGTH_SHORT).show();
    }

}