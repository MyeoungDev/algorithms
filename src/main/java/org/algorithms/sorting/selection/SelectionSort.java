package org.algorithms.sorting.selection;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {3, 5, 24, 12, 1, 7};

        int minIndex;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
