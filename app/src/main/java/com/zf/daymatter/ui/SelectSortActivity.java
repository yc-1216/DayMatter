package com.zf.daymatter.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zf.daymatter.R;
import com.zf.daymatter.mvp.BaseActivity;
import com.zf.daymatter.mvp.presenter.SelectSortPresenter;
import com.zf.daymatter.mvp.view.ISelectSortView;

/**
 * Created by Allever on 18/5/22.
 */

public class SelectSortActivity extends BaseActivity<ISelectSortView, SelectSortPresenter> implements ISelectSortView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sort);
    }

    @Override
    protected SelectSortPresenter createPresenter() {
        return new SelectSortPresenter();
    }
}
