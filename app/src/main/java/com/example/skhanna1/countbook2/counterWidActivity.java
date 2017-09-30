package com.example.skhanna1.countbook2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class counterWidActivity extends AppCompatActivity {

    Button buttonAdd;
    Button buttonSub;
    EditText Name;
    EditText counter;
    EditText comment;
    TextView Date;
    Button buttonReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_wid);

        buttonAdd = (Button)findViewById(R.id.button4);
        buttonSub = (Button)findViewById(R.id.button3);
        buttonReset = (Button)findViewById(R.id.button5);


        Name = (EditText)findViewById(R.id.editText5);
        counter = (EditText)findViewById(R.id.editText2);
        comment = (EditText)findViewById(R.id.editText6);
        Date = (TextView)findViewById(R.id.textView);

        Intent intent2 = getIntent();
        String Cname = intent2.getStringExtra(ListActivity.NAME);
        //Gets the Initial Value entered by the user
        final String IVal = intent2.getStringExtra(ListActivity.IVal);
        String CComment = intent2.getStringExtra(ListActivity.CCOM);

        Name.setText(Cname);
        //set the counter position to the value entered by user
        counter.setText(IVal);
        comment.setText(CComment);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //gets the value at the position
                String starVal = counter.getText().toString();
                //changes to integer
                int intStarVal = Integer.parseInt(starVal);
                //changes its value
                intStarVal++;

                counter.setText(String.valueOf(intStarVal));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String starVal2 = counter.getText().toString();
                int intStarVal2 = Integer.parseInt(starVal2);
                if(intStarVal2>0){
                    intStarVal2--;
                }
                counter.setText(String.valueOf(intStarVal2));
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counter.setText(String.valueOf(IVal));
            }
        });
    }

}
