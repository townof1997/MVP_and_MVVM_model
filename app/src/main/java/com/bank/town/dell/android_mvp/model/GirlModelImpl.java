package com.bank.town.dell.android_mvp.model;

import com.bank.town.dell.android_mvp.R;
import com.bank.town.dell.android_mvp.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2019/3/19.
 */

public class GirlModelImpl implements IGirlModel {
    @Override
    public void LoadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> data = new ArrayList<>();
        data.add(new Girl(R.drawable.f1, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f2, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f3, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f1, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f2, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f3, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f1, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f2, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f3, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f1, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f2, "五颗星", "五千蜜儿夏装新款"));
        data.add(new Girl(R.drawable.f3, "五颗星", "五千蜜儿夏装新款"));
        girlOnLoadListener.onComplete(data);
    }
}
