package com.bank.town.dell.android_mvvm.activity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bank.town.dell.android_mvp.BR;
import com.squareup.picasso.Picasso;

/**
 * Created by dell on 2019/3/22.
 * viewmodel
 */

public class User extends BaseObservable{
    private String name;
    private String password;

    private String header;//跟那个名字一样

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String header) {
        this.name = name;
        this.password = password;
        this.header = header;
    }

    @Bindable
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
        notifyPropertyChanged(BR.header);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    //自定义属性：(针对图片）提供一个静态方法加载image
    @BindingAdapter("bind:header")
    public static void  getImage(ImageView view,String url) {
        Picasso.with(view.getContext()).load(url).into(view);
    }

}
