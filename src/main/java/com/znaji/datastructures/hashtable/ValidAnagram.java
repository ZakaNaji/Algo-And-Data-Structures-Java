package com.znaji.datastructures.hashtable;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s1, String s2) {
        s1 = sortAlpha(s1);
        s2 = sortAlpha(s2);
        return s1.equals(s2);
    }

    private String sortAlpha(String s) {
        char [] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println("Valid: " + validAnagram.isAnagram("abc", "cba"));
        System.out.println("Invalid: " + validAnagram.isAnagram("abc", "cca"));

    }

}
