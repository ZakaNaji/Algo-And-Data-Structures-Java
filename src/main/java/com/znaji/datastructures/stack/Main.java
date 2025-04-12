package com.znaji.datastructures.stack;

public class Main {
    public static void main(String[] args) {
        String txt = "Hello";
        String reverseTxt = reverse(txt);
        System.out.println(reverseTxt);
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
}
