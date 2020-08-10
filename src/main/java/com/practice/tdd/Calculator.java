package com.practice.tdd;

public class Calculator {
    public int add(String input) {
        String[] inputArray = input.split("\\W+");
        if (inputArray.length == 1) {
            return inputArray[0] != "" ? Integer.valueOf(inputArray[0]) : 0;
        }
        int sum = 0;
        for (String s : inputArray) {
            sum += s != "" ? Integer.valueOf(s) : 0;
        }
        return sum;
    }
}
