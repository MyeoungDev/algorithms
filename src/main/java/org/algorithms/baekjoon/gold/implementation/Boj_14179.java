package org.algorithms.baekjoon.gold.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_14179 {

    private static int H;
    private static int W;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[] array;
    private static int[] leftMax;
    private static int[] rightMax;
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine(), " ");

        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        array = new int[W];
        for (int i = 0; i < W; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        leftMax = new int[W];
        rightMax = new int[W];

        leftMax[0] = array[0];
        rightMax[W - 1] = array[W - 1];

        int max = 0;
        for (int i = 0; i < W; i++) {
            leftMax[i] = max;
            max = Math.max(max, array[i]);
        }

        // 각 칸에서 오른쪽으로 가장 높은 높이를 계산합니다.
        max = 0;
        for (int i = W - 1; i >= 0; i--) {
            rightMax[i] = max;
            max = Math.max(max, array[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < W; i++) {
            int height = Math.min(leftMax[i], rightMax[i]) - array[i];
            if (height > 0) {
                totalWater += height;
            }
        }

        System.out.println(totalWater);
    }
}
