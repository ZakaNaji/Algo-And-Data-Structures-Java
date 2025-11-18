package com.znaji.datastructures.hashtable;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return  false;

        char[] count = new char[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (char c : count) {
            if (c != 0) return false;
        }
        return true;
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
