package com.example.lenovo.recyclerviewex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private String[] names;
    private TypedArray flowerPics;
    private String[] descriptions;
    private List<Member> memberList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        names = getResources().getStringArray(R.array.names);
        flowerPics = getResources().obtainTypedArray(R.array.flowers_pics);
        descriptions = getResources().getStringArray(R.array.description);

        memberList = new ArrayList<Member>();
        for (int i = 0; i < names.length; i++) {
            Member member = new Member(names[i], descriptions[i], flowerPics.getResourceId(i, -1));
            memberList.add(member);
        }

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(memberList, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }

}

