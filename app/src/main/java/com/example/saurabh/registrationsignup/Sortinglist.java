package com.example.saurabh.registrationsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortinglist extends AppCompatActivity {
ListView list_item;
    Button button;
    ArrayList<String> list;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sortinglist);
        list_item= (ListView) findViewById(R.id.list_item);
        button= (Button) findViewById(R.id.button);
        intilization();
    }

    private void intilization() {
        list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        list.add("rohan");
        list.add("gaurav");
        list.add("mohan");
        list.add("shoan");
        arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                list );

        list_item.setAdapter(arrayAdapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Collections.sort(list);
                arrayAdapter.notifyDataSetChanged();

            }
        });

    }

}
