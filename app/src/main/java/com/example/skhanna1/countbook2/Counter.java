package com.example.skhanna1.countbook2;

import java.util.Date;

/**
 * Created by skhanna1 on 9/27/17.
 */

public class Counter {

    String nameOfCounter;
    Date date;
    String currentValue;
    String initValue;
    String comment;

    public Counter(String name, String iVal, String Com){
        this.nameOfCounter = name;
        this.date = new Date();
        this.initValue = iVal;
        this.comment = Com;
        this.currentValue = iVal;
    }

    public void setCurrentValue(String value){
        this.currentValue = value;
    }
    public String getText(){
        return this.nameOfCounter;
    }

    public Date getDate(){
        return date;
    }

    public String getName(){
        return this.nameOfCounter;
    }

    public String getCurrentValue() { return this.currentValue; }

    public String getInitValue(){ return this.initValue;}
}
