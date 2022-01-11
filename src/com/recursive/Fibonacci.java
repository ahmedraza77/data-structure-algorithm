package com.recursive;

// 0 1 1 2 3 5 8 13 21 34 55
public class Fibonacci {

    // O(N)
    public static int fibonacciIterative(int index) {
        int[] arr = new int[index+1];
        if(index>=2){
            arr[0] = 0;
            arr[1] = 1;
        }
        else {
            return index;
        }

        for(int i=2; i<=index; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[index];
    }

    // O(2^n) => Exponential Time Complexity. Worse than O(N^2)
    public static int fibonacciRecursive(int index) {
        if(index<2){
            return index;
        }
        return fibonacciRecursive(index-1) + fibonacciRecursive(index-2);

    }

    public static void main(String[] args) {
        System.out.println(fibonacciIterative(8));
        System.out.println(fibonacciRecursive(8));
    }
}
