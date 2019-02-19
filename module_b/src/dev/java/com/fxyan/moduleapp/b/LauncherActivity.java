package com.fxyan.moduleapp.b;

import android.os.Bundle;

import com.fxyan.module.b.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author fxYan
 */
public final class LauncherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity_moduleb);
    }
}
