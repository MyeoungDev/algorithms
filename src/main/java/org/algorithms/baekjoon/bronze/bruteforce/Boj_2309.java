package org.algorithms.baekjoon.bronze.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_2309 {

    private static final int TOTAL = 100;
    private static final int COUNT = 9;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[COUNT];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((sum - arr[i] - arr[j]) == TOTAL) {
                    arr[i] = -1;
                    arr[j] = -1;
                    Arrays.sort(arr);
                    result(arr);
                    return;
                }
            }
        }
    }

    private static void result(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
