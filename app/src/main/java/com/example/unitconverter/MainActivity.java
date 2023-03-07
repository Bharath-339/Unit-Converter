package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ListView listview;
    String countries[];
    ArrayAdapter<String> adapter;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.list);
        countries = getResources().getStringArray(R.array.countries);

//        to connect with the datasource(countres)
//        with the listview we use adapter
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, countries);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {

                String country = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"You clicked on " + country,Toast.LENGTH_SHORT).show();
            }
        });

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,RecyclerView.class);
                startActivity(i);
            }
        });
    }


}