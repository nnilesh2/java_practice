package com.example;

import java.util.LinkedList;

public class ValidParentheses {

    // Input: s = "()[]{}"
    // Output: true

    public static void main(String[] args) {

        String s = "([{}])";
        String[] bracketArray = s.split("");
        LinkedList<String> stack = new LinkedList<>();
        System.out.print(isValid(bracketArray, stack));
    }

    private static boolean isValid(String[] bracketArray, LinkedList<String> stack) {
        for (String bracket : bracketArray) {
            if (bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {
                // If open bracket is encountered then push it on to stack
                stack.push(bracket);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                String top = stack.pop();
                if ((bracket == ")" && top != "(") ||
                        (bracket == "}" && top != "{") ||
                        (bracket == "]" && top != "[")) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}