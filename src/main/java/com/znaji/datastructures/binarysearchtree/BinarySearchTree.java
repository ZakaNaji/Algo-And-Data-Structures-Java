package com.znaji.datastructures.binarysearchtree;

public class BinarySearchTree {
    Node root;

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
