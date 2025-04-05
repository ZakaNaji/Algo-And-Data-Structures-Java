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

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index > length-1) return null;
        if (index == 0) return removeFirst();
        if (index == length-1) return removeLast();
        Node temp = get(index);
        Node before = temp.prev;
        Node after = temp.next;
        before.next = after;
        after.prev = before;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public void swapFirstLast() {
        if (length < 2) return;
        int temp = head.value;
        head.value = tail.value;
        tail.value = temp;
    }

    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;

            current = current.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    public boolean isPalindrome() {
        Node start = head;
        Node finish = tail;
        for (int i = 0; i < length/2; i++) {
            if (start.value != finish.value) return false;
            start = start.next;
            finish = finish.prev;
        }
        return true;
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
