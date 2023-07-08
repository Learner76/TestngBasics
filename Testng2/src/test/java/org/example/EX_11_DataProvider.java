package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

public class EX_11_DataProvider {

    @DataProvider(name="Testdata")
    public Object[][] testdata(){
        Object[][] obj ={{"1","2","3"},{"a","b","c"},{"abc","xyz"},{"11","12","12"}};
        return obj;
    }

    @Test(dataProvider="Testdata")
    public void test(String [] data)
    {
        for(String value : data){
            System.out.println("Readind data provider "+value);
        }
    }
}
