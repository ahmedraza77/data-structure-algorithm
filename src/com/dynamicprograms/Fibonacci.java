package com.dynamicprograms;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    int count1, count2;

    // With Recursion -> O(n^2)
    public int findFibonacciAtIndex(int index) {
        count1++; // Just to see no of call
        if(index<2) {
            return index;
        }
        return findFibonacciAtIndex(index-1) + findFibonacciAtIndex(index-2);
    }

    // Using Dynamic Programming
    // O(N)

    Map<Integer, Integer> cache = new HashMap<>();

    public  int findFibonacci(int index) {
        count2++; // Just to see no of call
        if(cache.containsKey(index)) {
            return cache.get(index);
        }
        else {
            if(index<2) {
                return index;
            }
            else {
                cache.put(index, findFibonacci(index-1) + findFibonacci(index-2));
                return cache.get(index);
            }
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        //System.out.println(f.findFibonacciAtIndex(8));
        System.out.println(f.findFibonacci(5));

       // System.out.println("Count 1: " + f.count1 + ". Count 2: " + f.count2);
    }
}
