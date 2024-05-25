package org.algorithms.baekjoon.silver.backtracaking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_15656 {

    private static int N;
    private static int M;
    private static boolean[] used;
    private static Integer[] sequence;
    private static StringTokenizer st;
    private static List<Integer> list = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        used = new boolean[N];
        sequence = new Integer[M];
        backtracking(0);

        System.out.println(sb);
    }

    private static void backtracking(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < list.size(); i++) {

            if (used[i] && sequence[depth - 1] == list.get(i)) {
                sequence[depth] = list.get(i);
            }

            if (!used[i]) {
                sequence[depth] = list.get(i);
                backtracking(depth + 1);
                used[i] = false;
            }
        }
    }
}
