package com.munstein.demomvp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BasicUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void checkMultipleInsertionInFakeBaseUsingMainModel() throws Exception {
        MainMVP.IMainModel mainModel = new FakeBase();
        mainModel.insertValue("test value 1");
        mainModel.insertValue("test value 2");
        mainModel.insertValue("test value 3");
        Assert.assertEquals(mainModel.getAllValues().size(), 3);
    }
}