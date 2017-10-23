package com.munstein.demomvp;

import java.util.List;

/**
 * Created by @Munstein on 18/10/2017. --03:03
 */

public class MainModel implements MainMVP.IMainModel {

    private final IRepository iRepository;

    public MainModel(IRepository iRepository){
        this.iRepository = iRepository;
    }

    @Override
    public List<String> getAllValues() {
        return iRepository.getValues();
    }

    @Override
    public void insertValue(String value) {
        iRepository.insertValue(value);
    }
}
