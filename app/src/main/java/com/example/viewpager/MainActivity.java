package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // 声明viewPager
    private ViewPager viewpager;
    // 声明集合
    private List<View> views;
    // 声明适配对象
    private MyNewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager = (ViewPager) this.findViewById(R.id.viewpager);
        views = new ArrayList<View>();
        LayoutInflater inflater = LayoutInflater.from(getApplicationContext());

        View view1 = inflater.inflate(R.layout.view01, null);
        View view2 = inflater.inflate(R.layout.view02, null);
        View view3 = inflater.inflate(R.layout.view03, null);

        views.add(view1);
        views.add(view2);
        views.add(view3);

        adapter = new MyNewAdapter(views);
        viewpager.setAdapter(adapter);


    }
}