package com.wan.basiccore.base;

import com.wan.basiccore.mvp.MvpPresenter;

/**
 * ================================================
 * 作    者：zhanglx
 * 版    本：1.0
 * 创建日期：2022/4/28 23:49
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class BasePresenter<V extends BaseView> extends MvpPresenter<V> {


    @Override
    public void attach(V baseView) {
        super.attach(baseView);


    }
}
