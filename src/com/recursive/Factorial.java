package com.recursive;

public class Factorial {

    // O(N)
    public static int factorialRecursive(int num) {
        if(num<2) {
            return 1;
        }
        return num*factorialRecursive(num-1);
    }

    // O(N)
    public static int factorialIterative(int num) {
        int fact =1;
        for(int i=num; i>1; i--) {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
        System.out.println(factorialIterative(5));
    }
}
