package com.munstein.demomvp;

import java.util.List;

/**
 * Created by @Munstein on 18/10/2017. --04:09
 */

public class MainPresenter implements MainMVP.IMainPresenter {

    private MainMVP.IMainView view;
    private MainMVP.IMainModel model;

    public MainPresenter(MainMVP.IMainView view, MainMVP.IMainModel model){
        this.view = view;
        this.model = model;
    }

    @Override
    public void insertValue(String value) {
        this.model.insertValue(value);
        this.view.showToast("Value added.");
        this.view.refreshValues(this.model.getAllValues());
    }

    @Override
    public List<String> getAllValues() {
        return this.model.getAllValues();
    }

}
