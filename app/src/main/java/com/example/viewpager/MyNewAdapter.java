package com.example.viewpager;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class MyNewAdapter extends PagerAdapter {

    List<View> views;

    public MyNewAdapter(List<View> views) {
        this.views = views;
    }

    // 返回View的个数
    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    // 销毁View
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        // container viewpager控件的容器
        ((ViewPager) container).removeView(views.get(position));
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ((ViewPager) container).addView(views.get(position));
        return views.get(position);
    }
}