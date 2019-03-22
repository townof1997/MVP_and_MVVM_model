package com.bank.town.dell.android_mvvm.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;

import com.bank.town.dell.android_mvp.R;
import com.bank.town.dell.android_mvp.databinding.ActivityMvvmBinding;

public class MvvmActivity extends AppCompatActivity {

    User user = null;

    Handler handler = new Handler(Looper.getMainLooper());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mvvm);
        ActivityMvvmBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_mvvm);
        //model
//        user = new User("town", "123");
//        binding.setUser(user);
        user = new User("town", "123", "http://www.pptbz.com/pptpic/UploadFiles_6909/201203/2012031220134655.jpg");
        binding.setUser(user);

        //延迟加载改变UI（model)文字
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                user.setName("yuanzhen");
                user.setPassword("123456");
            }
        }, 3000);
    }
}
