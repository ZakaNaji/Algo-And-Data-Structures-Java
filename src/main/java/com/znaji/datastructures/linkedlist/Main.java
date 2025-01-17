package com.znaji.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        System.out.println(linkedList);
        //test remove last:
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        //prepend test:
        linkedList.prepend(1);
        linkedList.prepend(0);
        linkedList.append(2);
        System.out.println(linkedList);

        //remove first test:
        System.out.println("removed value: " + linkedList.removeFirst());
        System.out.println("removed value: " + linkedList.removeFirst());
        System.out.println(linkedList);
    }
}
