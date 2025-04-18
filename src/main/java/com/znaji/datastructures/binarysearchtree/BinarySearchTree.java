package com.znaji.datastructures.binarysearchtree;

public class BinarySearchTree {
    Node root;

    public boolean insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node temp = root;
            while (true) {
                if (temp.value == value) return false;
                if (temp.value < value) {
                    if (temp.right == null) {
                        temp.right = new Node(value);
                        return true;
                    }
                    temp = temp.right;
                } else {
                    if (temp.left == null) {
                        temp.left = new Node(value);
                        return true;
                    }
                    temp = temp.left;
                }
            }
        }
        return true;
    }

    class Node {
        int value;
        Node right;
        Node left;

        Node(int value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return toString(root, "", true);
    }

    private String toString(Node node, String prefix, boolean isTail) {
        if (node == null) return "";

        StringBuilder sb = new StringBuilder();

        if (node.right != null) {
            sb.append(toString(node.right, prefix + (isTail ? "│   " : "    "), false));
        }

        sb.append(prefix)
                .append(isTail ? "└── " : "┌── ")
                .append(node.value)
                .append("\n");

        if (node.left != null) {
            sb.append(toString(node.left, prefix + (isTail ? "    " : "│   "), true));
        }

        return sb.toString();
    }

}
