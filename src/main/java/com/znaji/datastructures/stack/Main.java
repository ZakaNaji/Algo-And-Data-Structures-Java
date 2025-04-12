package com.znaji.datastructures.stack;

public class Main {
    public static void main(String[] args) {
        String txt = "(())()";
        System.out.println(isBalancedParentheses(txt));
    }

    private static String reverse(String txt) {
        StackWithArrayList<Character> stack = new StackWithArrayList<>();
        StringBuilder reverseString = new StringBuilder();
        for (char c : txt.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }
        return reverseString.toString();
    }

    private static boolean isBalancedParentheses(String txt) {
        StackWithArrayList<Character> stack = new StackWithArrayList<>();
        for (char p: txt.toCharArray()) {
            if (p == '(') {
                stack.push(p);
            } else if (p == ')'){
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
