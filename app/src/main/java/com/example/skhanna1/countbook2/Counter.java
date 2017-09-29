package com.example.skhanna1.countbook2;

import java.util.Date;

/**
 * Created by skhanna1 on 9/27/17.
 */

public class Counter {

    String nameOfCounter;
    Date date;
    Integer currentValue;
    Integer initValue;

    public Counter(String name){
        this.nameOfCounter = name;
        this.date = new Date();
        this.initValue = 0;
        this.currentValue=0;
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

    public Integer getCurrentValue() { return this.currentValue; }
}
