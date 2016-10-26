package com.xpp.news.materialdesigndemo.app;


import android.app.Application;

/**
 * Created by gongdongyang on 2016/10/22.
 */

public class XPApplication extends Application {

    private XPApplication _instance;

    @Override
    public void onCreate() {
        super.onCreate();
        _instance = this;
    }

    public XPApplication  getInstance(){
        return _instance;
    }
}
