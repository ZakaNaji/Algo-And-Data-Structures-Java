package com.znaji.datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue().value);
        System.out.println(queue);
    }
}
