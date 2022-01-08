package com.algorithms.sorting;

/*
*  Time Complexity O(n logn)
*  Worst Case: When pivot is largest or smallest ->  O(n^2)
*  Space Complexity ->  O(logn)
* */
public class QuickSort {

    public static void sorting(int[] arr) {
        int start = 0;
        int end = arr.length;
        quickSort(arr, start, end);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex+1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i<j) {
            while (i<j && arr[--j] >= pivot) ;
            if (i<j) {
                arr[i] = arr[j];
            }

            while (i<j && arr[++i] <= pivot) ;
            if (i<j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 6, 7, 1, 9, 4, 5};
        sorting(array);

        for (int i : array) {
            System.out.print(i);
        }
    }
}
