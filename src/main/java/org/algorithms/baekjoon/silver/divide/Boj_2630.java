package org.algorithms.baekjoon.silver.divide;

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
public class Boj_2630 {

    private static int N;
    private static int[][] arr;
    private static int WHITE_COUNT = 0;
    private static int BLUE_COUNT = 0;

    private static final int BLUE_SIGN = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, N);

        System.out.println(WHITE_COUNT);
        System.out.println(BLUE_COUNT);

    }

    private static void divide(int row, int col, int size) {


        if (colorCheck(row, col, size)) {
            if (arr[row][col] == BLUE_SIGN) {
                BLUE_COUNT++;
            } else {
                WHITE_COUNT++;
            }

            return;
        }

        size = size / 2;

        divide(row, col, size);     // 1사분면
        divide(row + size, col, size);      // 2사분면
        divide(row, col + size, size);      // 3사분면
        divide(row + size, col + size, size);       // 4사분면
    }

    private static boolean colorCheck(int row, int col, int size) {
        int color = arr[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }

}
