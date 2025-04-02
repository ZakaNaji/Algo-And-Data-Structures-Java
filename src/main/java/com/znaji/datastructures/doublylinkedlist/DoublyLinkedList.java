package com.znaji.datastructures.doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;
    }

    class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("DoublyLinkedList [length=").append(length).append("]\n");

        result.append("Head: ");
        result.append(head != null ? head.value : "null").append("\n");

        result.append("Tail: ");
        result.append(tail != null ? tail.value : "null").append("\n");

        result.append("Forward: ");
        Node current = head;
        while (current != null) {
            result.append("[");
            result.append(current.prev != null ? current.prev.value : "null");
            result.append(" <- ");
            result.append(current.value);
            result.append(" -> ");
            result.append(current.next != null ? current.next.value : "null");
            result.append("]");

            if (current.next != null) {
                result.append(" <-> ");
            }

            current = current.next;
        }

        result.append("\n");

        result.append("Backward: ");
        current = tail;
        while (current != null) {
            result.append("[");
            result.append(current.next != null ? current.next.value : "null");
            result.append(" <- ");
            result.append(current.value);
            result.append(" -> ");
            result.append(current.prev != null ? current.prev.value : "null");
            result.append("]");

            if (current.prev != null) {
                result.append(" <-> ");
            }

            current = current.prev;
        }

        return result.toString();
    }

}
