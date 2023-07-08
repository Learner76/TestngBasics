package org.example;

import org.example.Ex_6_2_CustomListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(org.example.Ex_6_2_CustomListener.class)
public class Ex_6_1_Custom_Testng_Example {

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void Test1() {

        System.out.println("Test1 Passes");
    }

    @Test
    public void Test2() {
        System.out.println("Test 2 Fails");

        assertEquals(0,1);
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("After Method");
    }
}
