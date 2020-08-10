package com.practice.tdd;

public class Calculator {
    public int add(String input) throws Exception {
        StringBuilder notValidNos = new StringBuilder();
        String delim = "\\s|,";
        if (input.startsWith("//")) {
            delim = delim+"|"+input.split("\\s")[0].replace("//", "");
            input = input.substring(input.indexOf('\n') + 1);
        }
        String[] inputArray = input.split(delim);

        if (inputArray.length == 1) {
            return inputArray[0] != "" ? Integer.valueOf(inputArray[0]) : 0;
        }
        int sum = 0;
        for (String s : inputArray) {
            int no = s != "" ? Integer.valueOf(s) : 0;
            if (no < 0) {
                notValidNos.append(String.format("%s,", no));
                continue;
            }
            sum += no;
        }
        if(notValidNos.length()>0) {
            throw new Exception(String.format("negatives not allowed ",notValidNos)) ;
        }
        return sum;
    }
}
