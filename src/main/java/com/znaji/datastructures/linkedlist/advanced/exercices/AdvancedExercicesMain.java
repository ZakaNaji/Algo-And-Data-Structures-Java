package com.znaji.datastructures.linkedlist.advanced.exercices;

public class AdvancedExercicesMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(0);
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        System.out.println(ll.findKthFromEnd(7));
    }
}
