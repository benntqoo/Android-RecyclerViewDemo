package com.demo.recyclerviewdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.demo.recyclerviewdemo.R;
import com.demo.recyclerviewdemo.VO.AndroidVO;
import com.demo.recyclerviewdemo.adapter.RecyclerViewDemoAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecyclerViewDemo extends AppCompatActivity {
    private List<String> version = new ArrayList<>();
    private List<String> memo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);

        RecyclerViewDemoAdapter adapter = new RecyclerViewDemoAdapter(initData());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_RecyclerDemo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<AndroidVO> initData() {
        version = Arrays.asList(getResources().getStringArray(R.array.android_version));
        memo = Arrays.asList(getResources().getStringArray(R.array.android_memo));

        List<AndroidVO> list = new ArrayList<>();
        for (int i = 0; i < version.size(); i++) {
            AndroidVO vo = new AndroidVO(version.get(i), memo.get(i));
            list.add(vo);
        }
        return list;
    }
}
