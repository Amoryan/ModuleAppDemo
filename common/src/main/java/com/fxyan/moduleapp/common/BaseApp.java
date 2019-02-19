package com.fxyan.moduleapp.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.fxyan.moduleapp.common.utils.LogUtils;

/**
 * @author fxYan
 */
public final class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        configARouter();

        registerActivityLifecycleCallbacks(new LifecycleCallback());
    }

    private void configARouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    class LifecycleCallback implements ActivityLifecycleCallbacks {

        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            LogUtils.d(String.format("%s onCreated", activity.getClass().getSimpleName()));
        }

        @Override
        public void onActivityStarted(Activity activity) {
            LogUtils.d(String.format("%s onStarted", activity.getClass().getSimpleName()));
        }

        @Override
        public void onActivityResumed(Activity activity) {
            LogUtils.d(String.format("%s onResumed", activity.getClass().getSimpleName()));
        }

        @Override
        public void onActivityPaused(Activity activity) {
            LogUtils.d(String.format("%s onPaused", activity.getClass().getSimpleName()));
        }

        @Override
        public void onActivityStopped(Activity activity) {
            LogUtils.d(String.format("%s onStopped", activity.getClass().getSimpleName()));
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            LogUtils.d(String.format("%s onSaveInstanceState", activity.getClass().getSimpleName()));
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            LogUtils.d(String.format("%s onDestroyed", activity.getClass().getSimpleName()));
        }
    }
}
