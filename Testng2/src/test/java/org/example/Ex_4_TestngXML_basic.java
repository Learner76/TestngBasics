// Create a Basic Testng class with minimal methods.

package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Ex_4_TestngXML_basic {

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
