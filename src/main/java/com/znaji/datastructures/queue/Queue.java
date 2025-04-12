package com.znaji.datastructures.queue;

public class Queue {

    Node first;
    Node last;
    int length;

    Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) return null;
        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
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
