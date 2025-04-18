package com.znaji.datastructures.hashtable;

public class HashTable {
    private int size = 7;
    private Node[] dataNode;

    HashTable() {
        this.dataNode = new Node[size];
    }

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HashTable (size = ").append(size).append(")\n");

        for (int i = 0; i < dataNode.length; i++) {
            sb.append("Bucket ").append(i).append(": ");

            Node current = dataNode[i];
            if (current == null) {
                sb.append("null\n");
            } else {
                while (current != null) {
                    sb.append("[ ")
                            .append(current.key)
                            .append(" : ")
                            .append(current.value)
                            .append(" ]");

                    current = current.next;
                    if (current != null) sb.append(" -> ");
                }
                sb.append("\n");
            }
        }

        return sb.toString();
    }

}
