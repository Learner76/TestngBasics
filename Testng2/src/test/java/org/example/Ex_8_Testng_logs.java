//Reporter.log do not log messages from Before and After methods. it's specific to Test method.
//Run below, you wont see Before and After method logs in Report.


package org.example;

import org.testng.Reporter;
import org.testng.annotations.*;

import org.testng.reporters.EmailableReporter;
import org.testng.reporters.TestHTMLReporter;

import static org.testng.Assert.assertEquals;

@Listeners({TestHTMLReporter.class,EmailableReporter.class})
public class Ex_8_Testng_logs {

    @BeforeMethod
    public void BeforeMethod() {
        Reporter.log("Before Method is running");

    }

    @Test ()
    public void Test1() {

        Reporter.log("Test 1 is running 1.");
        Reporter.log("Test 1 is running. 2");
        Reporter.log("Test 1 is running. 3");
    }

    @Test
    public void Test2() {
        Reporter.log("Test 2 Fails");
       // assertEquals(0,1);
    }

    @Test
    public void Test3() {
        Reporter.log("Test3 Passes");
    }

    @Test
    public void Test4() {
        Reporter.log("Test4 Passes");
    }

    @Test
    public void Test5() {
        Reporter.log("Test5 Passes");
    }

    @Test
    public void Test6() {
        Reporter.log("Test6 Passes");
    }


    @AfterMethod
    public void AfterSuit() {
        Reporter.log("After Method is running");
    }

}
