package com.znaji.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1);

        dll.prepend(0);
        dll.prepend(-1);

        System.out.println(dll);
    }
}
