package com.znaji.datastructures.queue;

import com.znaji.datastructures.stack.StackWithArrayList;

public class MyQueue {

    private StackWithArrayList<Integer> stack1 = new StackWithArrayList<>();
    private StackWithArrayList<Integer> stack2 = new StackWithArrayList<>();

    public void enqueue(int value) {
        stack1.push(value);
    }

    public Integer dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) return null;

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
