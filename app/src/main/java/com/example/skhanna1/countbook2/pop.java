package com.example.skhanna1.countbook2;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;

import static java.lang.Integer.parseInt;

/**
 * Created by skhanna1 on 9/28/17.
 */

public class pop extends ListActivity {

    EditText initialValue;
    EditText comment2;


    String initVal;
    String textComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_layout);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .7), (int) (height * 0.7));

        initialValue = (EditText) findViewById(R.id.popIVal);
        comment2 = (EditText) findViewById(R.id.comment);

        Button okButton = (Button) findViewById(R.id.button2);
        okButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                initVal = initialValue.getText().toString();
                textComment = comment2.getText().toString();
            }
        });

        //Intent returnIntent = new Intent();
        //returnIntent.putExtra("result", textComment);
        //finish();

    }

}
