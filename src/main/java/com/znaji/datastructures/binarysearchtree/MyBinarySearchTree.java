package com.znaji.datastructures.binarysearchtree;

public class MyBinarySearchTree {
    private Node root;

    public MyBinarySearchTree() {
    }

    public MyBinarySearchTree(int value) {
        this.root = new Node(value);
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        Node temp = root;
        while (true) {
            if (value < temp.value) {
                if (temp.left == null) {
                    temp.left = new Node(value);
                    return;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null) {
                    temp.right = new Node(value);
                    return;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    public Node find(int value) {
        Node temp = root;
        while (temp != null) {
            if (temp.value == value) return temp;
            if (value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return temp;
    }

    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
