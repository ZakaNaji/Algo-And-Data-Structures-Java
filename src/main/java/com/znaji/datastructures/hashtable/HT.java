package com.znaji.datastructures.hashtable;

public class HT {
    int size = 7;
    Node[] buckets = new Node[7];

    public static class Node {
        int value;
        Node next;
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

    public static void main(String[] args) {
        HT ht = new HT();
        int key = ht.hashKey("tqfl,azfdazfazfest");
        System.out.println(key);
    }
}
