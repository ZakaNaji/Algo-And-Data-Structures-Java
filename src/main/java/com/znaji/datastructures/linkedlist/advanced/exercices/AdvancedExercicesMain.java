package com.znaji.datastructures.linkedlist.advanced.exercices;

public class AdvancedExercicesMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(3);
        ll.append(1);
        ll.append(3);
        ll.append(2);
        ll.append(2);
        ll.append(10);

        ll.removeDuplicates();
        System.out.println(ll);
    }
}
