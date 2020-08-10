package com.practice.tdd;

public class Calculator {
    public int add(String input) {
        String[] inputArray = input.split(",");
        if (inputArray.length > 0) {
            return 0;
        }
        int sum = 0;
        for (String s : inputArray) {
            sum += Integer.valueOf(s);
        }
        return sum;
    }
}
