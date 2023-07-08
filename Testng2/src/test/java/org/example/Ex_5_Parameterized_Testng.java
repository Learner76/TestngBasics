//Simple example of parameterization from Testng.xml.
package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex_5_Parameterized_Testng {

    @Test
    @Parameters ({"key1","key2"})
    public  void test1(String var_a, String var_b) {
        System.out.println("key1 "+var_a);
        System.out.println("key2 "+var_b);
    }
}
