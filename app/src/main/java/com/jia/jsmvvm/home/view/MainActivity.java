package com.jia.jsmvvm.home.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jia.jsmvvm.R;
import com.jia.jsmvvm.databinding.ActivityMainBinding;
import com.jia.jsmvvm.home.viewmodel.NewsViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        NewsViewModel viewModel = new NewsViewModel(this, activityMainBinding);
    }
}
