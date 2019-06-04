package com.carter.androiddemo.modules.main.ui.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.carter.androiddemo.R;
import com.carter.androiddemo.base.activity.BaseActivity;
import com.carter.androiddemo.base.view.IView;
import com.carter.androiddemo.modules.main.contract.MainContract;
import com.carter.androiddemo.modules.main.presenter.MainPresenter;
import com.squareup.haha.perflib.Main;

public class MainActivity extends BaseActivity<MainPresenter<>>{


    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initToolbar() {

    }

    @Override
    protected void initEventAndData() {

    }
}
