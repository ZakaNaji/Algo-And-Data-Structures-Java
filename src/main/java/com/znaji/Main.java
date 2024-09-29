package com.znaji;

import com.znaji.arrays.MyArray;

public class Main {
    public static void main(String[] args) {
        MyArray<String> myArray = new MyArray<>(String.class);
        System.out.println(myArray);
        myArray.push("hello");
        System.out.println(myArray);
        myArray.push("world");
        System.out.println(myArray);
        myArray.shift(0);

        System.out.println(myArray);
    }
}