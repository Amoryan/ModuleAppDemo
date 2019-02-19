package com.fxyan.moduleapp.common;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;

/**
 * @author fxYan
 */
public abstract class BaseActivity extends CfgActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
    }

    @LayoutRes
    protected abstract int getLayoutId();
}
