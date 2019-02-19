package com.fxyan.moduleapp.common;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author fxYan
 */
class CfgActivity extends AppCompatActivity {

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                int[] location = new int[2];
                currentFocus.getLocationInWindow(location);
                int borderLeft = location[0];
                int borderTop = location[1];
                int borderRight = borderLeft + currentFocus.getWidth();
                int borderBottom = borderTop + currentFocus.getHeight();
                if (ev.getRawX() < borderLeft || ev.getRawX() > borderRight
                        || ev.getRawY() < borderTop || ev.getRawY() > borderBottom) {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public Resources getResources() {
        Resources resources = super.getResources();
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                configuration.fontScale = 1.f;
                /*
                 * resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                 */
                return createConfigurationContext(configuration).getResources();
            }
        }
        return resources;
    }
}
