// tesng @Test annotation has groups , dependsonmethod , invocationcount and dependsongroup.
//use for the same.

package org.example;

import org.testng.annotations.Test;

public class Ex_7_Testng_Groups {


    @Test (groups = {"group1","smoke"})
    public void Test1(){
        System.out.println("Test 1 running");
    }
    @Test (groups = {"group1","smoke"})
    public void Test2(){
        System.out.println("Test 2 running");
    }
    @Test (groups = {"group2","smoke"} )
    public void Test3(){
        System.out.println("Test 3 running");
    }
    @Test (groups = {"group2","smoke"} )
    public void Test4(){
        System.out.println("Test 4 running");
    }

    @Test(dependsOnMethods={"Test1","Test2"})
    public void finaltest(){
        System.out.println("A dependent test");
    }

    @Test(groups = {"group3"},dependsOnGroups = {"group2"})
    public void finalgrouptest(){
        System.out.println("A dependent test");
    }

}

