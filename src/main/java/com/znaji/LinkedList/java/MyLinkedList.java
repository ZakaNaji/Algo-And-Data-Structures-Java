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

    public static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
