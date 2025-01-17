package com.znaji.datastructures.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            tail = null;
            head = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        // Add general details about the linked list
        result.append("LinkedList Details:\n");
        result.append("Length: ").append(length).append("\n");
        result.append("Head: ").append(head != null ? head.value : "null").append("\n");
        result.append("Tail: ").append(tail != null ? tail.value : "null").append("\n");
        result.append("Nodes: ");

        // Traverse the list and print all nodes
        Node current = head;
        while (current != null) {
            result.append("[Value: ").append(current.value)
                    .append(", Next: ")
                    .append(current.next != null ? current.next.value : "null")
                    .append("] -> ");
            current = current.next;
        }
        result.append("null");

        return result.toString();
    }

}
