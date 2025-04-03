package com.znaji.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.insert(1, 99); // should be: 1 <-> 99 <-> 2 <-> 3
        dll.insert(0, 0);  // should be: 0 <-> 1 <-> ...
        dll.insert(5, 4);  // should append at end: ... <-> 4
        System.out.println(dll);
    }
}
