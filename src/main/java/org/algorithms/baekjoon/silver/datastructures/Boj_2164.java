package org.algorithms.baekjoon.silver.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_2164 {
    private static int N;
    private static Queue<Integer> queue = new LinkedList<>();
    private static BufferedReader br;
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(N);
            return;
        }

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() != 2) {
            queue.remove();
            Integer remove = queue.remove();
            queue.add(remove);
        }

        queue.remove();
        System.out.println(queue.remove());
    }
}
