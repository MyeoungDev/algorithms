package org.algorithms.baekjoon.silver.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_2805 {

    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(parametricSearch(M));

    }

    private static long parametricSearch(int M){
        long low = 1;
        long high = arr[arr.length - 1];

        while(low <= high){
            long mid = (low + high) / 2;
            long count = 0;

            for (int value : arr) {
                if(value - mid > 0){
                    count += value - mid;
                }
            }

            if(count >= M){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
}
