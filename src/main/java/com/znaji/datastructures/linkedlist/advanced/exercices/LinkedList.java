package com.znaji.datastructures.linkedlist.advanced.exercices;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findMiddleNode() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean hasLoop() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }

    public Node findKthFromEnd(int k) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i<k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void partitionList(int x) {
        if (head == null) return;

        Node d1 = new Node(0);
        Node d2 = new Node(0);

        Node p1 = d1;
        Node p2 = d2;

        Node current = head;
        while (current != null) {
            if (current.value < x) {
                p1.next = current;
                p1 = current;
            } else {
                p2.next = current;
                p2 = current;
            }
            current = current.next;
        }
        head = d1.next;
        p1.next = d2.next;
        p2.next = null;
        tail = p2;
    }

    public void removeDuplicates() {
        if (head == null) return;

        final Set<Integer> elements = new HashSet<>();
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (elements.contains(current.value)) {
                current = current.next;
                prev.next = current;
            } else {
                elements.add(current.value);
                prev = current;
                current = current.next;
            }
        }
    }

    public int binaryToDecimal() {
        int num = 0;
        Node currentNode = head;
        while(currentNode != null) {
            num = num*2 + currentNode.value;
            currentNode = currentNode.next;
        }

        return num;
    }


    public Node get(int index) {
        Node temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp;
    }
    public void reverseBetween(int m, int n) {
        if (head == null) return;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 0; i <m; i++) {
            prev = prev.next;
        }
        Node start = prev.next;
        Node then = start.next;

        for (int i = 0; i < n - m; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        head = dummy.next;
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
