// we can use ITestListener interface or TestListnerAdapter class.
// if you use ITestListener, you need define all the method even if you need.
//TestListnerAdopter implement all methods ITestlistner.
// so we can extend TestListnerAdopter and override once we need.


package org.example;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Ex_6_2_CustomListener extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        System.out.println("Listner says Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        System.out.println("Listner says  Test Failed");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
        System.out.println("Listner says  Test Skppied");
    }

    @Override
    public void onTestStart(ITestResult result) {
        super.onTestStart(result);
        System.out.println(" Listner says Test Start");
    }
}
