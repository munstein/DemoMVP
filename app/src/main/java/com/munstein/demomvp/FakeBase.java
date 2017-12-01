package com.munstein.demomvp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @Munstein on 18/10/2017. --03:04
 */

public class FakeBase implements MainMVP.IMainModel{

    private static FakeBase instance = null;
    private ArrayList<String> values;

    public FakeBase(){
        values = new ArrayList<>();
    }

    @Override
    public List<String> getAllValues() {
        return values;
    }

    @Override
    public void insertValue(String value) {
        values.add(value);
    }

}
