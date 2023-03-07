package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    private View recyclerview;
    private RecylerAdapter adapter;


    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> msgs = new ArrayList<>();
    private ArrayList<Integer> imageList  = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerview = findViewById(R.id.recyclerview);
//        recyclerview.setLayoutManager(new LinearLayoutManager(RecyclerView.this));    // ctrl + alt +space
        recyclerview.setLayoutManager(new LinearLayoutManager(RecyclerView.this));

        names.add("bharath");
        names.add("Teddy Bear");
        names.add("Hmm");
        names.add("Sunny");
        names.add("Chinnu");

        msgs.add("Adhi nene");
        msgs.add("pora Psycho");
        msgs.add("Hmm chalu le inka");
        msgs.add("Kothi naa Koduku");
        msgs.add("Edhi kuda nene");

        imageList.add(R.drawable.me);
        imageList.add(R.drawable.me);
        imageList.add(R.drawable.me);
        imageList.add(R.drawable.me);
        imageList.add(R.drawable.me);

        adapter = new RecylerAdapter(names,msgs,imageList,RecyclerView.this);
        recyclerview.setAdapter(adapter);

    }
}