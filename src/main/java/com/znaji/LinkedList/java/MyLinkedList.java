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

    public Node unshift() {
        if (length == 0) {
            return null;
        }
        final Node temp = head;
        head = head.next;
        length--;
        if (length == 0 ) {
            tail = null;
        }
        return temp;
    }

    public Node pop() {
        if (length == 0) {
            return null;
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
        return currentNode;
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

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if (index == 0) {
            return unshift();
        }
        if (index == length - 1) {
            return pop();
        }
        final Node prevNode = get(index - 1);
        final Node temp = prevNode.next;
        prevNode.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        if (length == 0) return;

        Node temp = head;
        Node after;
        Node before = null;
        head = tail;
        tail = temp;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node getHead() {
        return head;
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head.next;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
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
        Node next;

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
