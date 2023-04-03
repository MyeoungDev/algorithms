package org.algorithms.sorting.counting;

import java.util.Arrays;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 7, 9};
        int[] sorted_arr = new int[5];

        // 과정 1 - counting 배열의 사이즈를 최대값 5가 담기도록 크게 잡기
        int[] counting = new int[10];

        // 과정 2 - counting 배열의 값을 증가해주기.
        for (int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }

        // 과정 3 - counting 배열을 누적합으로 만들어주기.
        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        // 과정 4 - 뒤에서부터 배열을 돌면서, 해당하는 값의 인덱스에 값을 넣어주기.
        for (int i = arr.length - 1; i >= 0; i--) {
            counting[arr[i]]--;
            sorted_arr[counting[arr[i]]] = arr[i];
        }
        System.out.println(Arrays.toString(sorted_arr));
    }
}
