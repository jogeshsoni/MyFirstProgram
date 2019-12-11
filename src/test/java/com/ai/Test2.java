package com.ai;

import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void aTest1() {
        System.out.println("aTest1()");
    }

    @Test
    public void aTest2() {
        System.out.println("aTest2()");
    }

    @Test
    public void aTest3() {
        System.out.println("aTest3()");
    }

    @Test
    public void aTest4() {
        System.out.println("aTest4()");
    }

    @Test
    public static void aTest5() {
        System.out.println("aTest5()");
    }

    public static void main(String[] args) {
        Test2 pig = new Test2();

        //pig.aTest1();

    }
}
