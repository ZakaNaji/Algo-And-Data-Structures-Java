package com.znaji.datastructures.linkedlist.revisit;

import java.util.HashSet;
import java.util.Set;

public class LL {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "[" + value + "]";
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node pop() {
        if (length == 0) return null;
        Node temp = head;
        Node prev = head;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (length == 0) {
            tail = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node node = get(index);
        if (node == null) return false;
        node.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            push(value);
            return true;
        }
        Node prev = get(index - 1);
        Node newNode = new Node(value);
        newNode.next = prev.next;
        prev.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return pop();
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        tail = head;
        Node temp = head;
        Node after;
        Node before = null;
        while (temp != null) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        head = before;
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
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
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public Node findKthFromEnd(int k) {
        Node fast = head;
        Node slow = head;
        //move s by k:
        for (int i = 0; i < k; i++) {
            if (fast != null) {
                fast = fast.next;
            } else {
                return null;
            }
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public void partitionList(int x) {
        Node lesser = new Node(0);
        Node lesserPointer = lesser;
        Node greater = new Node(0);
        Node greaterPointer = greater;
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            temp.next = null;
            if (temp.value < x) {
                lesserPointer.next = temp;
                lesserPointer = lesserPointer.next;
            } else {
                greaterPointer.next = temp;
                greaterPointer = greaterPointer.next;
            }
            temp = next;
        }
        lesserPointer.next = greater.next;
        head = lesser.next != null ? lesser.next : greater.next;
        tail = greaterPointer != greater ? greaterPointer : lesserPointer;
    }

    public void removeDuplicates() {
        if (length == 0) return;
        Set<Integer> seen = new HashSet<>();
        Node current = head;
        seen.add(current.value);

        while (current.next != null) {
            if (seen.contains(current.next.value)) {
                length--;
                current.next = current.next.next;
            } else {
                seen.add(current.next.value);
                current = current.next;
            }
            tail = current;
        }
    }

    public void reverseBetween(int m, int n) {
        if (head == null) return;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 0; i < m; i++) {
            prev = prev.next;
        }
        Node curr = prev.next;

        for (int i = 0; i < n - m; i++) {
            Node next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        head = dummy.next;
    }

    public void swapInPairs() {
        if (head == null) return;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node current = head;
        Node next;
        while (current != null && current.next != null) {
            next = current.next;
            prev.next = next;
            current.next = next.next;
            next.next = current;
            prev = current;
            current = current.next;
        }
        head = dummy.next;
        tail = prev.next != null? prev.next : prev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value);
            sb.append(" -> ");
            temp = temp.next;
        }
        sb.append("null]");
        sb.append(String.format("{H=%s, T=%s, L=%d}", head, tail, length));
        return sb.toString();
    }
}
