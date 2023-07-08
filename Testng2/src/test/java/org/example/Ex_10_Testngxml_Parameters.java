package org.example;

import org.testng.ITest;
import org.testng.annotations.*;

public class Ex_10_Testngxml_Parameters {

    @Parameters({"env","profile"})
    @BeforeMethod
    public void setup( String env, String profile){
        System.out.println(" Running Set up for "+env+profile);
    }

    @Test
    @Parameters({"env","profile"})
    public void test(String env, String profile){
        System.out.println("Running Tests"+env+profile);
    }

    @AfterMethod
    public  void teardown(){
        System.out.println("Running tear down");
    }

}
