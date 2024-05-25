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
public class Boj_15664 {

    private static int N;
    private static int M;
    private static boolean[] used;
    private static List<Integer> list = new ArrayList<>();
    private static int[] sequence;
    private static StringTokenizer st;
    private static List<String> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        used = new boolean[N];
        sequence = new int[M];

        backtracking(0, 0);

        result.stream()
            .distinct()
            .forEach(System.out::println);

    }

    private static void backtracking(int depth, int start) {

        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(sequence[i]).append(" ");
            }
            result.add(sb.toString());
            return;
        }

        for (int i = start; i < list.size(); i++) {
            sequence[depth] = list.get(i);
            backtracking(depth + 1, i + 1);
        }

    }
}
