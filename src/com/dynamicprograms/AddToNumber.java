package com.dynamicprograms;

import java.util.HashMap;
import java.util.Map;

public class AddToNumber {
    Map<Integer, Integer> cache;

    public AddToNumber() {
        cache = new HashMap<>();
    }

    // Memorization -> Specific form of caching
    public int addNumberTo80(int num){
        if (!cache.containsKey(num)) {
            System.out.println("Some long operations");
            cache.put(num, num + 80);
        }
        return cache.get(num);
    }

    public static void main(String[] args) {
        AddToNumber obj = new AddToNumber();
        System.out.println(obj.addNumberTo80(5));
        System.out.println(obj.addNumberTo80(5));
        System.out.println(obj.addNumberTo80(5));
    }
}
