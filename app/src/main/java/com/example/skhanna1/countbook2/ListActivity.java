package com.example.skhanna1.countbook2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;

public class ListActivity extends AppCompatActivity {

    EditText counterName;
    int numOfCounters = 0;
    Button addCounter;


    //Creating Array with Counter objects
    ArrayList<Counter> counterObjArray;
    //Bridge between UI and data in array
    ArrayAdapter<Counter> counterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //user enters the name of counter and we get it
        counterName = (EditText)findViewById(R.id.editText3);

        //Creating Array
        counterObjArray = new ArrayList<Counter>();

        //connecting to the add counter button
        addCounter = (Button)findViewById(R.id.button);

        addCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameOfCounter = counterName.getText().toString();
                numOfCounters++;

                //creating pop up
                Intent intent = new Intent(ListActivity.this, pop.class);
                startActivity(intent);



                Counter newCounter = new Counter(nameOfCounter);

                counterObjArray.add(newCounter);

                ListView list = (ListView)findViewById(R.id.counterList);

                counterAdapter = new CustomAdapter(ListActivity.this, R.layout.custom_list, counterObjArray);

                list.setAdapter(counterAdapter);

                counterAdapter.notifyDataSetChanged();
            }
        });
    }

}