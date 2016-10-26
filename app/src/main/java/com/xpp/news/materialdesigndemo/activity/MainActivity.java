package com.xpp.news.materialdesigndemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xpp.news.materialdesigndemo.R;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int setContentLayoutId() {
        return R.layout.activity_main;
    }

    public void initView(){

    }
}
