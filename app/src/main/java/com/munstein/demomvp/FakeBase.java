package com.munstein.demomvp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @Munstein on 18/10/2017. --03:04  
 */

public class FakeBase implements IRepository{

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


    @Override
    public List<String> getValues() {
        return values;
    }

    @Override
    public void insertValue(String value) {
        values.add(value);
    }

}
