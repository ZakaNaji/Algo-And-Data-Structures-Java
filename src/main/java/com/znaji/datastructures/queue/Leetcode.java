package com.znaji.datastructures.queue;

import java.util.*;

public class Leetcode {
    public static void main(String[] args) {
        Deque<Character> stack = new ArrayDeque<>();
        if (stack.isEmpty())
        stack.pop();
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
        if (text == null || text.isBlank()) return false;
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> reverse = Map.of(')', '(', '}', '{', ']', '[');

        for (char c : text.toCharArray()) {
            if (isOpen(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty() || stack.pop() != reverse.get(c)) return false;
            }
        }
        return stack.isEmpty();
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
