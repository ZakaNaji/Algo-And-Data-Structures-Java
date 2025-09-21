package com.znaji.datastructures.hashtable;

public class HT {
    int size = 7;
    Node[] buckets = new Node[7];

    public static class Node {
        int value;
        String key;
        Node next;

        public Node(String key, int value) {
            this.value = value;
        }
    }

    private int hashKey(String key) {
        int prime = 23;
        char[] chars = key.toCharArray();
        int hashedKey = 0;
        for (char c : chars) {
            hashedKey = (hashedKey + c * prime) % buckets.length;
        }
        return hashedKey;
    }

    public void set(String key, int value) {
        int keyIndex = hashKey(key);
        Node root = buckets[keyIndex];
        Node newNode = new Node(key, value);
        if (root == null) {
            buckets[keyIndex] = newNode;
            return;
        }

        while (root.next != null) {
            root = root.next;
        }
        root.next = newNode;
    }

    public Integer get(String key) {
        int keyIndex = hashKey(key);
        Node node = buckets[keyIndex];
        while (node != null) {
            if (node.key == key) return node.value;
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        HT ht = new HT();
        int key = ht.hashKey("tqfl,azfdazfazfest");
        System.out.println(key);
    }
}
