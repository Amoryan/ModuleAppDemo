package com.fxyan.moduleapp.a;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fxyan.moduleapp.common.BaseActivity;
import com.fxyan.moduleapp.common.arouter.ModuleAUri;

/**
 * @author fxYan
 */
@Route(path = ModuleAUri.ACTIVITY_MODULE_A)
public final class ModuleAActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_modulea;
    }

}
