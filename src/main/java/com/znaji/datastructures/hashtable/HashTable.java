package com.znaji.datastructures.hashtable;

public class HashTable {
    private int size = 7;
    private Node[] dataNode;

    HashTable() {
        this.dataNode = new Node[size];
    }

    private int hash(String key) {
        int hash = 0;
        int prime = 31;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash * prime + key.charAt(i)) % size;
        }
        return hash;
    }

    public void set(String key, int value) {
        int position = hash(key);
        Node temp = dataNode[position];
        if (temp == null) {
            dataNode[position] = new Node(key, value);
        } else {
            while (true) {
                if (temp.key.equals(key)) {
                    temp.value = value;
                    return;
                }
                if (temp.next == null) {
                    temp.next = new Node(key, value);
                    return;
                }
                temp = temp.next;
            }
        }
    }

    public Integer get(String key) {
        int position = hash(key);
        Node temp = dataNode[position];
        while (temp != null) {
            if (temp.key.equals(key)) return temp.value;
            temp = temp.next;
        }
        return null;
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
