package com.znaji.datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();

        ht.set("car", 10);
        ht.set("moto", 20);
        ht.set("jets", 30);
        ht.set("boats", 40);
        ht.set("boats", 50);
        ht.set("elec", 50);
        ht.set("babt", 50);
        ht.set("cockatils", 50);

        System.out.println(ht.get("test"));
    }
}
