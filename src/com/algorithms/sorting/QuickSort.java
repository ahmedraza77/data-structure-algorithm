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
        int pivotIndex = partition2(arr, start, end-1);
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

    public static int partition2(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 6, 7, 1, 9, 4, 5};
        sorting(array);

        for (int i : array) {
            System.out.print(i);
        }
    }
}
