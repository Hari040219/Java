package Java.SortingAlgorithims;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};
        int n = arr.length;

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // find index of minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap if minIndex changed
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // print sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

