package com.znaji.datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop().value);
        System.out.println(stack);
    }
}
