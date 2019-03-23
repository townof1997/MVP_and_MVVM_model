package com.bank.town.dell.android_mvvm.listactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.bank.town.dell.android_mvp.BR;
import com.bank.town.dell.android_mvp.R;
import com.bank.town.dell.android_mvvm.activity.User;

import java.util.ArrayList;
import java.util.List;

public class MVVMListActivity extends AppCompatActivity {

    ListView list;
    List<User> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvmlist);
        list = findViewById(R.id.listview);
        data.add(new User("town", "01", "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1161038902,3936739042&fm=26&gp=0.jpg"));
        data.add(new User("town2", "02", "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1161038902,3936739042&fm=26&gp=0.jpg"));
        data.add(new User("town3", "03", "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1161038902,3936739042&fm=26&gp=0.jpg"));
        data.add(new User("town4", "04", "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1161038902,3936739042&fm=26&gp=0.jpg"));
        list.setAdapter(new CommAdapter<User>(this,getLayoutInflater(),R.layout.item_layout, BR.user,data));
    }
}
