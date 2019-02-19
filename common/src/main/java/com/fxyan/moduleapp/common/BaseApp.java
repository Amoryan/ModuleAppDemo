package com.fxyan.moduleapp.common;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author fxYan
 */
public final class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this);
    }
}
