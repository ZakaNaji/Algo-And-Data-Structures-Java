package com.znaji.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        System.out.println(linkedList);
        //test get(index):
        System.out.println(linkedList.get(3));//null
        System.out.println(linkedList.get(2));//3
    }
}
