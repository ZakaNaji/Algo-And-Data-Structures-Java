package com.znaji.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1);

        dll.append(2);

        dll.removeLast();
        dll.removeLast();
        dll.removeLast();

        System.out.println(dll);
    }
}
