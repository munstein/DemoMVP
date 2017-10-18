package com.munstein.demomvp;

import java.util.List;

/**
 * Created by @Munstein on 18/10/2017. --03:03
 */

public class MainModel implements MainMVP.IMainModel {

    FakeBase fakeBase;

    @Override
    public List<String> getAllValues() {
        return fakeBase.getInstance().getValues();
    }



    @Override
    public void insertValue(String value) {
        FakeBase.getInstance().addValue(value);
    }
}
