package com.practice.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {

    @Test
    public void test1() {
        Calculator c =new Calculator();
        assertEquals(0, c.add(""));
    }
}
