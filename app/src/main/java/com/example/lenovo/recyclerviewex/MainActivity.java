package com.example.lenovo.recyclerviewex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import static com.example.lenovo.recyclerviewex.R.array.flowers_pics;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private String[] names;
    private TypedArray flower_pics;
    private String[] discriptions;
    private List<Member> memberList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        names = getResources().getStringArray(R.array.names);
        flower_pics= getResources().obtainTypedArray(R.array.flowers_pics);
        discriptions = getResources().getStringArray(R.array.discription);

        memberList = new ArrayList<Member>();
        for (int i = 0; i < names.length; i++) {
            Member member = new Member(names[i], discriptions[i], flower_pics.getResourceId(i, -1));
            memberList.add(member);
        }

        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerview.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(memberList, MainActivity.this);
        recyclerview.setAdapter(adapter);
    }

}

