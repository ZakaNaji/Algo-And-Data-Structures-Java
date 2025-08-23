package com.znaji.datastructures.queue;

public class Leetcode {
    public static void main(String[] args) {
        StackWithArrayList<Integer> stack = new StackWithArrayList<>();
        String text = "hello";
        System.out.println(reverse(text));
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
}
