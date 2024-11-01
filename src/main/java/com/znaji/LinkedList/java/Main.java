package com.znaji.LinkedList.java;

public class Main {

    public static void main(String[] args) {
        final MyLinkedList myLL = new MyLinkedList(1);
        myLL.append(2);
        myLL.append(3);
        myLL.append(4);
        //create a circle:
        createPartialLoop(myLL);
        System.out.println(myLL.hasLoop());
    }

    public static void createPartialLoop(MyLinkedList list) {
        list.getHead().next.next.next = list.getHead().next;
    }
}
