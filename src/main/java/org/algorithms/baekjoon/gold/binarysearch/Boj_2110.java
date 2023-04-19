package org.algorithms.baekjoon.gold.binarysearch;

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
public class Boj_2110 {

    private static int[] home;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        home = new int[N];

        for (int i = 0; i < N; i++) {
            home[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(home);

        int left = 1;  // 최소 거리 -> 모든 집에 공유기 설치한다 가정하면 1이됨.
        int right = home[N - 1] - home[0]; // 최대 거리 -> 처음 집과마지막 집 사이의 거리가 최대 거리
        int distance;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 1;  // 처음 집은 무조건 하나 설치하고 넘어간다고 가정
            int start = home[0];

            for (int i = 1; i < home.length; i++) {
                distance = home[i] - start;
                if (distance >= mid) {
                    count++;
                    start = home[i];
                }
            }

            if (count >= C) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);

    }
}
