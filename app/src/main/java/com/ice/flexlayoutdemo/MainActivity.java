package com.ice.flexlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private String[] names={
            "aa",
            "bbb",
            "ccc",
            "dsadadada",
            "aa",
            "bbb",
            "ccc",
            "dsadadada",
            "aa",
            "bbb",
            "ccc",
            "dsadadada"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        FlexboxLayoutManager flexboxLayoutManager=new FlexboxLayoutManager();
        flexboxLayoutManager.setFlexWrap(FlexWrap.WRAP);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(new DemoAdapter(names));
    }
}
