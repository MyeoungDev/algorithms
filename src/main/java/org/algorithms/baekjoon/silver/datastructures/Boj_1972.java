package org.algorithms.baekjoon.silver.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_1972 {

    private static PriorityQueue<Integer> heap = new PriorityQueue<>();
    private static int N;
    private static BufferedReader br;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value == 0) {
                Integer poll = heap.poll();
                if (Objects.isNull(poll)) {
                    poll = 0;
                }
                sb.append(poll).append("\n");
                continue;
            }
            heap.add(value);
        }

        System.out.println(sb);
    }
}
