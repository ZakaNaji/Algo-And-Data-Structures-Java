package com.znaji.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        System.out.println(linkedList);
        //test set(index, value):
        System.out.println(linkedList.set(0, 0));
        System.out.println(linkedList.set(1, 10));
        System.out.println(linkedList.set(2, 20));
        System.out.println(linkedList.set(3, 30));
        System.out.println(linkedList);
    }
}
