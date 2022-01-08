package com.algorithms.sorting;

public class InsertionSort {

    // Fastest with small and nearly sorted data
    public static int[] insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {8,2,6,7,1,9,4,5};

        for (int i : insertionSort(array)) {
            System.out.print(i);
        }
    }
}
