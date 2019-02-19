package com.fxyan.module.b;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fxyan.moduleapp.common.arouter.ModuleBUri;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author fxYan
 */
@Route(path = ModuleBUri.ACTIVITY_MODULE_B)
public final class ModuleBActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity_moduleb);
    }
}
