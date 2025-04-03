package com.znaji.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        System.out.println("Before: " + dll);
        DoublyLinkedList.Node removed = dll.removeFirst();
        System.out.println("Removed: " + removed.getValue());
        System.out.println("After: " + dll);
    }
}
