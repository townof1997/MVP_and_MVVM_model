package com.bank.town.dell.android_mvp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.bank.town.dell.android_mvp.bean.Girl;

import java.util.List;

/**
 * Created by dell on 2019/3/19.
 */

public class GirlApdapter extends BaseAdapter {

    Context context;
    List<Girl> list = null;

    public GirlApdapter(Context context, List<Girl> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
