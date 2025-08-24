package com.znaji.datastructures.queue;

import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        StackWithArrayList<Integer> stack = new StackWithArrayList<>();
        String text = "()[]{}";
        System.out.println(isValid(text));
    }

    public static String reverse(String text) {
        var charsStack = new StackWithArrayList<Character>();
        for (Character c : text.toCharArray()) {
            charsStack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            sb.append(charsStack.pop());
        }
        return sb.toString();
    }

    public static boolean isValid(String text) {
        if (text == null || text.isBlank() || text.length() % 2 != 0) return false;

        StackWithArrayList<Character> stack = new StackWithArrayList();
        char[] array = text.toCharArray();
        int size = array.length;
        for (int i = 0; i < size; i++) {
            char c = array[i];
            if (isOpen(c)) {
                stack.push(c);
            } else {
                if (c != reverseChar(stack.pop())) return false;
            }
        }
        return true;
    }

    private static boolean isOpen(char c) {
        return Arrays.asList('{', '(', '[').contains(c);
    }

    private static char reverseChar(char c) {
        return switch (c) {
            case '{' -> '}';
            case '(' -> ')';
            case '[' -> ']';
            default -> throw new IllegalArgumentException("wrong char");
        };
    }
}
