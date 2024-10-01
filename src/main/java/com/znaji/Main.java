package com.znaji;

import com.znaji.arrays.ArrayStringFunctions;
import com.znaji.arrays.MyArray;

public class Main {
    public static void main(String[] args) {
        String str = "hello world.";
        String str2 = "123456";
        System.out.println(ArrayStringFunctions.reverseRecursive(str));
        System.out.println(ArrayStringFunctions.reverseRecursive(str2));
    }
}