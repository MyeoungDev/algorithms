package org.algorithms.binarysearch;

import java.util.Arrays;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class BinarySearch {
    public static void main(String[] args) {

    }

    private static int search(int[] arr, int target) {

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }

        }

        return -1;
    }

}
