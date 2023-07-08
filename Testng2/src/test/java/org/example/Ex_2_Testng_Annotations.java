// use common assertions.

package org.example;

import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;
import org.testng.reporters.*;


@Listeners({EmailableReporter.class, TestHTMLReporter.class,JUnitXMLReporter.class, XMLReporter.class})
public class Ex_2_Testng_Annotations {

    @BeforeSuite
    public void BeforeSuit() {
        System.out.println("Before Suit Method");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("Before Test Method");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("Before Class");
    }

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

    @Test
    public void Test3() {
        System.out.println("Test3 Passes");
    }

    @Test
    public void Test4() {
        System.out.println("Test4 Passes");
    }

    @Test
    public void Test5() {
        System.out.println("Test5 Passes");
    }

    @Test
    public void Test6() {
        System.out.println("Test6 Passes");
    }


    @AfterSuite
    public void AfterSuit() {
        System.out.println("After Suit Method");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("After Test Method");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("After Method");
    }
}
