package com.znaji.datastructures.linkedlist.advanced.exercices;

public class AdvancedExercicesMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.reverseBetween(1,3);

        System.out.println(ll);
    }
}
