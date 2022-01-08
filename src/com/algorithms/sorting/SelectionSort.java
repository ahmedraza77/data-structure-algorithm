package com.algorithms.sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {

        for(int i=arr.length-1; i>0; i--) {
            int maxIndex = i;
            int max = arr[i];
            for(int j=i-1; j>=0; j--) {
                if(arr[j]>arr[maxIndex]) {
                    maxIndex = j;
                    max = arr[maxIndex];
                }
            }
            arr[maxIndex]=arr[i];
            arr[i] = max;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] array = {8,2,6,7,1,9,4,5};

        for (int i : selectionSort(array)) {
            System.out.print(i);
        }
    }
}
