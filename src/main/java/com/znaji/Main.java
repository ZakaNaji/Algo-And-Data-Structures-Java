package com.znaji;

import com.znaji.arrays.ArrayStringFunctions;
import com.znaji.arrays.MyArray;

public class Main {
    public static void main(String[] args) {
        String palindrome1 = "madam";
        String palindrome2 = "civic";
        String palindrome3 = "noon";
        String nonPalindrome = "test";
        System.out.println(ArrayStringFunctions.isStringAPalindrome(palindrome1));
        System.out.println(ArrayStringFunctions.isStringAPalindrome(palindrome2));
        System.out.println(ArrayStringFunctions.isStringAPalindrome(palindrome3));
        System.out.println(ArrayStringFunctions.isStringAPalindrome(nonPalindrome));
    }
}