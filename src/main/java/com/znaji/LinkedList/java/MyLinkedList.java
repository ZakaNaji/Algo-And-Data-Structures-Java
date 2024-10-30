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

    public void append(int value) {
        final Node node = new Node(value);

        if (length == 0 ) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public void prepend(int value) {
        final Node node = new Node(value);
        node.next = head;
        head = node;
        length ++;
        if (length == 1) {
            tail = head;
        }
    }

    public void unshift() {
        if (length == 0) {
            return;
        }
        head = head.next;
        length--;
        if (length == 0 ) {
            tail = null;
        }
    }

    public void pop() {
        if (length == 0) {
            return;
        }

        Node currentNode = head;
        Node newTail = currentNode;
        while (currentNode.next != null) {
            newTail = currentNode;
            currentNode = currentNode.next;
        }
        newTail.next = null;
        tail = newTail;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;

        Node node = head;
        int i = 0;
        while (i < index) {
            node = node.next;
            i++;
        }
        return node;
    }

    public boolean insertAt(int index, int value) {
        if (index < 0) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index >= length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node prevNode = get(index - 1);
        if (prevNode != null) {
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            length++;
            return true;
        }
        return false;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
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

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
