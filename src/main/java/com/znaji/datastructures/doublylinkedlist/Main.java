package com.znaji.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);
        dll.append(50);

        System.out.println(dll.get(0).getValue()); // 10
        System.out.println(dll.get(2).getValue()); // 30
        System.out.println(dll.get(4).getValue()); // 50
        System.out.println(dll.get(5));       // null (out of bounds)
    }
}
