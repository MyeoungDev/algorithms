package org.algorithms.sorting.insertion;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 24, 12, 1, 7};

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i - 1;
            while ((prev >= 0) && arr[prev] > temp) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = temp;
        }
    }
}
