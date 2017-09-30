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

/*String strEditVal;
String strEditCom;
Intent intent;
String strEditVal2;
String strEditCom2;

String nameOfCounter;

/*@Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode==RESULT_OK){
                strEditVal = data.getStringExtra("iVal");
                strEditCom = data.getStringExtra("com");
            }
        }
    }*/



public class ListActivity extends AppCompatActivity {


    public static final String NAME = "nameOfCounter";
    public static final String IVal = "InitialVal";
    public static final String CCOM = "CounterComment";
    EditText counterName;
    int numOfCounters = 0;
    Button addCounterButton;

    ArrayList<Counter> counterObjArray;
    //Bridge between UI and data in array
    ArrayAdapter<Counter> counterAdapter;
    Counter newCounter;
    EditText counterComment;
    EditText counterInit;
    String nameOfCounter;
    String InitVal;
    String CComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //user enters the name of counter and we get it
        counterName = (EditText)findViewById(R.id.editText3);
        counterComment = (EditText)findViewById(R.id.editText);
        counterInit = (EditText)findViewById(R.id.editText4);

        //connecting to the add counter button
        addCounterButton = (Button)findViewById(R.id.button);

        addCounterButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterObjArray = new ArrayList<Counter>();
                nameOfCounter = counterName.getText().toString();
                InitVal = counterInit.getText().toString();
                CComment = counterComment.getText().toString();
                createList(nameOfCounter,InitVal,CComment);

            }
        });



    }

    public void createList(String name, String initialValue, String Comment){
        newCounter = new Counter(name, initialValue, Comment);
        counterObjArray.add(newCounter);
        ListView list = (ListView) findViewById(R.id.counterList);

        counterAdapter = new CustomAdapter(ListActivity.this, R.layout.custom_list, counterObjArray);

        list.setAdapter(counterAdapter);

        counterAdapter.notifyDataSetChanged();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(ListActivity.this, counterWidActivity.class);
        intent.putExtra(NAME,nameOfCounter);
        intent.putExtra(IVal,InitVal);
        intent.putExtra(CCOM, CComment);
                startActivity(intent);
            }
        });

    }

}
