package com.example.apple.buglydemo;

import android.app.Application;

/**
 * @author crazyZhangxl on 2018/12/13.
 * Describe:
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        BuglyHelper.getInstance().initBuglyApp(this);
    }
}
