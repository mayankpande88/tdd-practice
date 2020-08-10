package com.practice.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {

    @Test
    public void test1() throws Exception {
        Calculator c =new Calculator();
        assertEquals(0, c.add(""));
    }
    
    @Test
    public void test2() throws Exception {
        Calculator c= new Calculator();
        assertEquals(5,c.add("1,1,1,1,1"));
    }
    
    @Test
    public void test3() throws Exception {
        Calculator c= new Calculator();
        assertEquals(5,c.add("1\n1,1,1,1"));
        assertEquals(5,c.add("1\n1,1,1,1\n"));
    }
    
    @Test
    public void test4() throws Exception {
        Calculator c= new Calculator();
        assertEquals(5,c.add("//;\n1\n1;1;1;1"));
    }
    
    @Test(expected =Exception.class)
    public void test5() throws Exception {
        Calculator c= new Calculator();
        assertEquals(5,c.add("//;\n1\n1;1;-1;-4"));
    }
}
