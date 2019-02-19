package com.fxyan.moduleapp;

import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.fxyan.moduleapp.common.BaseActivity;
import com.fxyan.moduleapp.common.arouter.ModuleAUri;
import com.fxyan.moduleapp.common.arouter.ModuleBUri;

/**
 * @author fxYan
 */
public final class LauncherActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_launcher;
    }

    public void toModuleA(View view) {
        ARouter.getInstance().build(ModuleAUri.ACTIVITY_MODULE_A).navigation();
    }

    public void toModuleB(View view) {
        ARouter.getInstance().build(ModuleBUri.ACTIVITY_MODULE_B).navigation();
    }

}
