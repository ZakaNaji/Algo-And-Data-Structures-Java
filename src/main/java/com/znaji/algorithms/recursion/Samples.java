package com.znaji.algorithms.recursion;

public class Samples {
    public static void main(String[] args) {
        int factorial = factorialOf(5);
        System.out.println("factorial of 5: " + factorial);
    }

    private static int factorialOf(int num) {
        if (num == 1) return 1;
        return factorialOf(num-1) * num;
    }
}
