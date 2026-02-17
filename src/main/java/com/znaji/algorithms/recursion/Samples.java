package com.znaji.algorithms.recursion;

public class Samples {
    public static void main(String[] args) {
        int factorial = factorialOf(5);
        System.out.println("factorial of 5: " + factorial);

        int fibonacciedSequence = fibonacciSequence(40);
        System.out.println("Fibonacci sequence: " + fibonacciedSequence);
    }

    private static int factorialOf(int num) {
        if (num == 1) return 1;
        return factorialOf(num-1) * num;
    }

    private static int fibonacciSequence(int n) {
        if (n < 2) return n;
        return fibonacciSequence(n-1) + fibonacciSequence(n-2);
    }
}
