package org.example;

import org.testng.annotations.Test;

public class Ex_9_2_Parallel_Execution {

    @Test
    public void test1() throws Exception{
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            System.out.println("Class 2 Test 1 running");
        }
    }

    @Test
    public void test2() throws Exception{
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            System.out.println("Class 2 Test 2 running");
        }
    }

    @Test
    public void test3() throws Exception{
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            System.out.println("Class 2 Test 3 running");
        }
    }
    @Test
    public void test4() throws Exception{
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            System.out.println("Class 2 Test 4 running");
        }
    }

    @Test
    public void test5() throws Exception{
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            System.out.println("Class 2 Test 5 running");
        }
    }

    @Test
    public void test6() throws Exception{
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            System.out.println("Class 2 Test 6 running");
        }
    }
}
