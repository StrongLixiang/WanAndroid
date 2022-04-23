package com.wan.basiccore.mvp;

import android.util.SparseArray;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * ================================================
 * 作    者：zhanglx
 * 版    本：1.0
 * 创建日期：2022/4/23 23:20
 * 描    述：
 * 修订历史：
 * ================================================
 */
public abstract class CacheActivity extends AppCompatActivity {
    private SparseArray<View> mViewCaches = null;


    @Override
    public <T extends View> T findViewById(int id) {
        if (mViewCaches == null) {
            mViewCaches = new SparseArray<>();
        }

        View view = mViewCaches.get(id);
        if (view == null) {
            view = getWindow().getDecorView().findViewById(android.R.id.content).findViewById(id);
            mViewCaches.put(id, view);
        }
        return (T) view;
    }
}
