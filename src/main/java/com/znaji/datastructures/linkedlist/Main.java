package com.znaji.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        System.out.println(linkedList);
        //test insert(index, value):
        System.out.println(linkedList.insert(0, -1));
        System.out.println(linkedList.insert(3, 4));
        System.out.println(linkedList.insert(1, 0));
        System.out.println(linkedList.insert(6,5));
        System.out.println(linkedList);
        System.out.println(linkedList.remove(4));
        System.out.println(linkedList);
    }
}
