package com.fxyan.moduleapp.b;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fxyan.moduleapp.b.R;
import com.fxyan.moduleapp.common.BaseActivity;
import com.fxyan.moduleapp.common.arouter.ModuleBUri;

/**
 * @author fxYan
 */
@Route(path = ModuleBUri.ACTIVITY_MODULE_B)
public final class ModuleBActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.b_activity_moduleb;
    }

}
