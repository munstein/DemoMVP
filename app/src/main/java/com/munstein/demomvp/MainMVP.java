package com.munstein.demomvp;

import java.util.List;

/**
 * Created by @Munstein on 18/10/2017. --02:59
 */

public interface MainMVP {

    interface IMainPresenter{
        void insertValue(String value);
        List<String> getAllValues();
    }

    interface IMainView{
        void showToast(String msg);
        void refreshValues(List<String> values);
    }

    interface IMainModel{
        List<String> getAllValues();
        void insertValue(String value);
    }
}