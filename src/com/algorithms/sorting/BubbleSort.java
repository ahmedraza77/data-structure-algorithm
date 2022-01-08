package com.algorithms.sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {8,2,6,7,1,9,4,5};

        for (int i : bubbleSort(array)) {
            System.out.print(i);
        }
    }
}
