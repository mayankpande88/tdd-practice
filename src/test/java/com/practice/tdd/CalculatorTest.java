package com.practice.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {

    @Test
    public void test1() {
        Calculator c =new Calculator();
        assertEquals(0, c.add(""));
    }
    
    @Test
    public void test2() {
        Calculator c= new Calculator();
        assertEquals(5,c.add("1,1,1,1,1"));
    }
    
    @Test
    public void test3() {
        Calculator c= new Calculator();
        assertEquals(5,c.add("1\n1,1,1,1"));
        assertEquals(5,c.add("1\n1,1,1,1\n"));
    }
}
