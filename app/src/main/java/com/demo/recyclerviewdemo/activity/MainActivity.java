package com.demo.recyclerviewdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.demo.recyclerviewdemo.R;

public class MainActivity extends AppCompatActivity {
    String[] demoList = new String[]{"Recycler View"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler Demo");

        ListView listView = (ListView) findViewById(R.id.lv_MainListView);
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, demoList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, RecyclerViewDemo.class));
                        break;
                }
            }
        });
    }
}
