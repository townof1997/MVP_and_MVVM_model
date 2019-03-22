package com.bank.town.dell.android_mvp.model;

import com.bank.town.dell.android_mvp.bean.Girl;

import java.util.List;

/**
 * Created by dell on 2019/3/19.
 * 用来加载数据
 */

public interface IGirlModel {
    //如果数据来源非常耗时，我们应该单独设计一个回调接口
//    void LoadGirl(List<Girl> list);
    void LoadGirl(GirlOnLoadListener girlOnLoadListener);
    interface GirlOnLoadListener{
        void onComplete(List<Girl> girls);
    }
}
