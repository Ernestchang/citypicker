package com.ihidea.as.citypicker;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * 作者：liji on 2017/12/15 10:55
 * 邮箱：lijiwork@sina.com
 * QQ ：275137657
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        refWatcher = LeakCanary.install(this);
    }


    //在自己的Application中添加如下代码
    private RefWatcher refWatcher;

    //在自己的Application中添加如下代码
    public static RefWatcher getRefWatcher(Context context) {
        MyApp application = (MyApp) context.getApplicationContext();
        return application.refWatcher;
    }
}
