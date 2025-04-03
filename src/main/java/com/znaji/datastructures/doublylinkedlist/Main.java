package com.znaji.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(10);
        dll.append(20);
        dll.append(30);

        System.out.println(dll.set(1, 99)); // true
        System.out.println(dll.get(1).getValue()); // 99

        System.out.println(dll.set(5, 100)); // false (index out of bounds)
    }
}
