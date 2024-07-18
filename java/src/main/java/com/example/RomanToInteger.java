package com.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman)); // Output: 1994
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (char c : s.toCharArray()) {
            int currentValue = romanMap.get(c);
            total += currentValue;
            if (currentValue > prevValue) {
                total -= 2 * prevValue;
            }
            prevValue = currentValue;
        }

        return total;
    }
}
