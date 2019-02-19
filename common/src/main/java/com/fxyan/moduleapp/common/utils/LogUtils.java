package com.fxyan.moduleapp.common.utils;

import android.util.Log;

import com.fxyan.moduleapp.common.BuildConfig;

/**
 * @author fxYan
 */
public final class LogUtils {

    public static void d(String msg) {
        d("fxYan", msg);
    }

    public static void d(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void e(String msg) {
        e("fxYan", msg);
    }

    public static void e(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, msg);
        }
    }
}
