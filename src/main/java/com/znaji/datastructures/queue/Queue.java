package com.znaji.datastructures.queue;

public class Queue {

    int value;
    Node first;
    Node last;
    int length;

    Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Queue (front → back)\n");
        result.append("Length: ").append(length).append("\n");

        Node current = first;
        while (current != null) {
            result.append("[ ").append(current.value).append(" ]");
            if (current.next != null) {
                result.append(" -> ");
            }
            current = current.next;
        }

        return result.toString();
    }

}
