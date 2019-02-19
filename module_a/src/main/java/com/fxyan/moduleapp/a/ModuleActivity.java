package com.fxyan.moduleapp.a;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fxyan.moduleapp.common.arouter.ModuleAUri;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author fxYan
 */
@Route(path = ModuleAUri.ACTIVITY_MODULE_A)
public final class ModuleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity_modulea);
    }
}
