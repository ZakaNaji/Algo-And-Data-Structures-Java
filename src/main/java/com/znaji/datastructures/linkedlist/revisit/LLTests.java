package com.znaji.datastructures.linkedlist.revisit;

public class LLTests {
    public static void main(String[] args) {
        LL ll = new LL();

        ll.push(1);

        System.out.println(ll);
        ll.swapInPairs();
        System.out.println(ll);
    }
}
