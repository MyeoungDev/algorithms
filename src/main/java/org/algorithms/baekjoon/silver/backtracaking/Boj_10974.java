package org.algorithms.baekjoon.silver.backtracaking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_10974 {

    private static int N;
    private static boolean[] used;
    private static int[] sequence;
    private static BufferedReader br;
    private static List<Integer> list = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        used = new boolean[N];
        sequence = new int[N];

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        backtracking(0);
        System.out.println(sb);
    }

    private static void backtracking(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                used[i] = true;
                sequence[depth] = list.get(i);
                backtracking(depth + 1);
                used[i] = false;
            }
        }

    }
}
