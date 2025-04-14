package com.znaji.datastructures.stack;

public class Main {
    public static void main(String[] args) {
        StackWithArrayList<Integer> stack = new StackWithArrayList<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);
        sortStack(stack);
        System.out.println(stack);
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

    public static void sortStack(StackWithArrayList<Integer> stack) {
        StackWithArrayList<Integer> sortedStack = new StackWithArrayList<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
    }
}
