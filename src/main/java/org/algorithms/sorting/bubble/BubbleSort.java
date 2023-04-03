package org.algorithms.sorting.bubble;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class BubbleSort {

    public static void main(String[] args) {
//        int[] arr = new int[10];
        int[] arr = {3, 2, 1, 24, 19, 6};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
