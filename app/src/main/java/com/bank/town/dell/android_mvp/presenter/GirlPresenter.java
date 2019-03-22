package com.bank.town.dell.android_mvp.presenter;

import com.bank.town.dell.android_mvp.bean.Girl;
import com.bank.town.dell.android_mvp.model.GirlModelImpl;
import com.bank.town.dell.android_mvp.model.IGirlModel;
import com.bank.town.dell.android_mvp.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by dell on 2019/3/19.
 */

public class GirlPresenter<T extends IGirlView> extends BasePresenter<T>{
    //1,需要view层的引用
//    T view;
//    protected WeakReference<T> girlView;
//    IGirlView girlView;
    //2,需要model层的引用
    IGirlModel iGirlModel = new GirlModelImpl();
    //3,初始化
    public GirlPresenter() {
    }

    public GirlPresenter(T view) {//弱引用方便绑定和解绑的问题，仿造fragment的attach和detach(弱引用）
        this.mViewRef = new WeakReference<T>(view) ;
    }

//    public GirlPresenter(T view) {
//        this.girlView = view;
//    }

    //4,执行UI逻辑
    public void fetch() {
        if(mViewRef.get() != null) {
            mViewRef.get().showLoading();;
            if (iGirlModel!=null) {
                iGirlModel.LoadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        if(mViewRef!=null) {
                            mViewRef.get().showGirls(girls);
                        }
                    }
                });
            }
        }
    }
    //进行绑定
//    public void attachView(T view) {
//        girlView = new WeakReference<T>(view);
//    }
//
//    //解绑
//    public void detachView(){
//        girlView.clear();
//    }










}
