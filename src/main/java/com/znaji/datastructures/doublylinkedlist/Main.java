package com.znaji.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);

        System.out.println("Before: " + dll);
        DoublyLinkedList.Node removed = dll.remove(2); // should remove 3
        System.out.println("Removed: " + removed.getValue());
        System.out.println("After: " + dll);
    }
}
