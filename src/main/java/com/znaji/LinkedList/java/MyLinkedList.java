package com.znaji.LinkedList.java;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(int value) {
        final Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyLinkedList{");
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append(", length=").append(length).append('}');
        return sb.toString();
    }

    public static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
