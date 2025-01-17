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

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
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
