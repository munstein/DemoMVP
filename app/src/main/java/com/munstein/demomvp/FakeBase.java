package com.munstein.demomvp;

import java.util.ArrayList;

/**
 * Created by @Munstein on 18/10/2017. --03:04
 */

public class FakeBase {

    private static FakeBase instance = null;
    private ArrayList<String> values;

    private FakeBase(){
        values = new ArrayList<>();
    }

    public static FakeBase getInstance(){
        if(instance == null){
            instance = new FakeBase();
        }
        return instance;
    }

    public void addValue(String value){
        values.add(value);
    }

    public ArrayList<String> getValues(){
        return values;
    }

}
