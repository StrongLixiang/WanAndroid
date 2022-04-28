package com.wan.basiccore.mvp;

import android.content.Context;

/**
 * ================================================
 * 作    者：zhanglx
 * 版    本：1.0
 * 创建日期：2022/4/28 23:39
 * 描    述：
 * 修订历史：
 * ================================================
 */
public interface MvpView {
    Context getContext();

    void showLoadingDialog();

    void dismissLoadingDialog();

    void showLoadingBar();

    void dismissLoadingBar();

    void clearLoading();
}
