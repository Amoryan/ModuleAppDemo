package com.fxyan.moduleapp;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.fxyan.moduleapp.common.arouter.ModuleAUri;
import com.fxyan.moduleapp.common.arouter.ModuleBUri;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author fxYan
 */
public final class LauncherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void toModuleA(View view) {
        ARouter.getInstance().build(ModuleAUri.ACTIVITY_MODULE_A).navigation();
    }

    public void toModuleB(View view) {
        ARouter.getInstance().build(ModuleBUri.ACTIVITY_MODULE_B).navigation();
    }

}
