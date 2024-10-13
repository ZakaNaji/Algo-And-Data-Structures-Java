package com.znaji.LinkedList.java;

public class Main {

    public static void main(String[] args) {
        final MyLinkedList myLL = new MyLinkedList(10);
        myLL.append(100);
        myLL.append(1000);
        myLL.pop();
        myLL.pop();
        myLL.pop();
        System.out.println(myLL);
    }
}
