package com.bank.town.dell.android_mvp.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by dell on 2019/3/19.
 */

public class BasePresenter<T> {
    //
    protected WeakReference<T> mViewRef;
















    //进行绑定
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    //解绑
    public void detachView(){
        mViewRef.clear();
    }

}
