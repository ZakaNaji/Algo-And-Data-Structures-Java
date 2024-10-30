package com.znaji.LinkedList.java;

public class Main {

    public static void main(String[] args) {
        final MyLinkedList myLL = new MyLinkedList(1);
        myLL.append(2);
        myLL.append(3);
        myLL.append(4);
        System.out.println(myLL.set(0, 50));
        System.out.println(myLL);
    }
}
