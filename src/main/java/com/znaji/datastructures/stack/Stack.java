package com.znaji.datastructures.stack;

public class Stack {

    Node top;
    int length;

    Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        length = 1;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public Node pop() {
        if (length ==0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        length--;
        return temp;
    }
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Stack (top → bottom)\n");
        result.append("Length: ").append(length).append("\n");

        Node current = top;
        while (current != null) {
            result.append("[ ").append(current.value).append(" ]\n");
            current = current.next;
        }

        return result.toString();
    }
}
