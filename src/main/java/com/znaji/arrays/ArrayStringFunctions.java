package com.znaji.arrays;

public class ArrayStringFunctions {

    public static boolean isStringAPalindrome(String str) {
        char[] strAsCharArray = str.toCharArray();
        for (int i = 0; i < strAsCharArray.length; i++) {
            if (strAsCharArray[i] != strAsCharArray[strAsCharArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
