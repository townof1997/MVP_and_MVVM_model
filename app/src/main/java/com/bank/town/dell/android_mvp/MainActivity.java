package com.bank.town.dell.android_mvp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.bank.town.dell.android_mvp.adapter.GirlApdapter;
import com.bank.town.dell.android_mvp.bean.Girl;
import com.bank.town.dell.android_mvp.presenter.GirlPresenter;
import com.bank.town.dell.android_mvp.view.BaseActivity;
import com.bank.town.dell.android_mvp.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView{

    ListView listView;

    //表示层对象
//    GirlPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

//        new GirlPresenter<>(this).fetch();

//        presenter = new GirlPresenter();
//        presenter.attachView(this);
        presenter.fetch();
    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "加载成功", Toast.LENGTH_SHORT).show();;
    }

    @Override
    public void showGirls(List<Girl> girls) {
        GirlApdapter adapter = new GirlApdapter(this,girls);

        listView.setAdapter(adapter);
    }
}
