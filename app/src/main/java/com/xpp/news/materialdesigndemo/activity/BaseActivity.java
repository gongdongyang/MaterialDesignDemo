package com.xpp.news.materialdesigndemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by gongdongyang on 2016/10/23.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局
        setContentView(setContentLayoutId());
        ButterKnife.bind(this);
        initView();

    }

    public abstract  int setContentLayoutId();

    public abstract  void initView();
}
