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

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node remove = tail;
        if (length ==1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            remove.prev = null;
        }
        length--;
        return remove;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node removedNode = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = removedNode.next;
            removedNode.next = null;
            head.prev = null;
        }
        length--;
        return removedNode;
    }

    public Node get(int index) {
        if (index <0 || index >= length) return null;
        Node temp;
        if (index <length/2) {
            temp = head;
            for (int i=0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i=length-1; i>index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node changedNode = get(index);
        if (changedNode != null) {
            changedNode.value = value;
            return true;
        }
        return false;
    }

    class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
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
