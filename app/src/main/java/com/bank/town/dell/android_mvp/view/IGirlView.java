package com.bank.town.dell.android_mvp.view;

import com.bank.town.dell.android_mvp.bean.Girl;

import java.util.List;

/**
 * Created by dell on 2019/3/19.
 */

public interface IGirlView {
    void showLoading();
    //显示listview 中的数据(通过回调的方式返回数据
    void showGirls(List<Girl> girls);
}
