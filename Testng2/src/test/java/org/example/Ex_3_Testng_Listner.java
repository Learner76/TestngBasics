//Testng Reports : When you ran Test from XML, By default reports will enabled and created.
//However when you run Test from class like this, Default reports are disabled.
//To enable them, we just need to add listeners from 'org.testng.listeners' to our class.
//Note : Multiple annotation needs to comma seperated and enclosed in curly braces.


package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Below are the report type.
import org.testng.reporters.EmailableReporter;
import org.testng.reporters.JUnitXMLReporter;
import org.testng.reporters.TestHTMLReporter;
import org.testng.reporters.XMLReporter;

import static org.testng.Assert.assertEquals;


@Listeners({EmailableReporter.class, TestHTMLReporter.class, JUnitXMLReporter.class, XMLReporter.class})
public class Ex_3_Testng_Listner {

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
