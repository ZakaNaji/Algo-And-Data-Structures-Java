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

    public static String reverse(String str) {
        char[] strArray = str.toCharArray();
        int start = 0;
        int end = strArray.length - 1;
        while (start < end) {
            char temp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = temp;
            start++;
            end--;
        }
        return new String(strArray);
    }

    public static String reverseRecursive(String str) {
        if (str.isEmpty()) return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
