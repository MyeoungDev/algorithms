package org.algorithms.baekjoon.silver.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_11279 {
    public static void main(String[] args) throws IOException {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value == 0) {
                if (!priorityQueue.isEmpty()) {
                    sb.append(priorityQueue.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                priorityQueue.offer(value);
            }
        }

        System.out.println(sb);
    }
}
