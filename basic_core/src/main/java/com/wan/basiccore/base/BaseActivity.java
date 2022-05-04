package com.wan.basiccore.base;

import android.app.Activity;
import android.os.Bundle;

import com.wan.basiccore.mvp.MVPActivity;

import androidx.annotation.Nullable;

/**
 * ================================================
 * 作    者：zhanglx
 * 版    本：1.0
 * 创建日期：2022/5/4 21:50
 * 描    述：
 * 修订历史：
 * ================================================
 */
public  abstract class BaseActivity<P extends BasePresenter> extends MVPActivity<P> {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    /**
     * 是否注册事件分发，默认不绑定
     */

    protected boolean isRegisterEventBus(){
        return false;
    }

    @Override
    protected void initialize() {
        super.initialize();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



}
