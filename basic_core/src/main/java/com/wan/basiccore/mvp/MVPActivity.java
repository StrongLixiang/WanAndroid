package com.wan.basiccore.mvp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * ================================================
 * 作    者：zhanglx
 * 版    本：1.0
 * 创建日期：2022/5/4 22:20
 * 描    述：
 * 修订历史：
 * ================================================
 */
public abstract class MVPActivity<P extends MvpPresenter> extends CacheActivity implements MvpView, View.OnClickListener {

    public P presenter;

    /**
     * 获取布局资源文件
     */
    protected abstract int getLayoutId();

    /**
     * 初始化presenter
     */
    public abstract P initPresenter();

    /**
     * 初始化控件
     */
    protected abstract void initView();

    /**
     * 绑定数据
     */
    protected abstract void loadData();

    /**
     * 点击事件，可连续点击
     */
    protected boolean onClick1(View v) {
        return false;
    }

    /**
     * 点击事件，500毫秒第一次
     */
    protected void onClick2(final View v) {
    }


    protected void initWindow() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initWindow();
        if (getLayoutId() > 0) {
            setContentView(getLayoutId());
        }
        presenter = initPresenter();
        if (presenter != null) {
            presenter.attach(this);
        }
        initialize();


    }

    protected void initialize() {
        initView();
        loadData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detach();
        }
    }


    @Override
    public Context getContext() {
        return getActivity();
    }

    protected Activity getActivity() {
        return this;
    }

    /**
     * 用注解绑定点击事件时，在该方法绑定
     */
    @Override
    public void onClick(View view) {
        if (!onClick1(view)) {

        }
    }
}
