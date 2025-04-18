package com.znaji.datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(15);
        bst.insert(7);
        bst.insert(30);
        bst.insert(14);
        bst.insert(8);
        bst.insert(6);
        System.out.println(bst);

        System.out.println(bst.contains(100));
    }
}
