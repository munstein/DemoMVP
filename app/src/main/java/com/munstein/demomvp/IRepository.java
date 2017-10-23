package com.munstein.demomvp;

import java.util.List;

/**
 * Created by @Munstein on 20/10/2017. --01:21
 */

public interface IRepository {
    List<String> getValues();
    void insertValue(String value);
}
