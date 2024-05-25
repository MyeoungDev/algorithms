package org.algorithms.baekjoon.silver.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_1021 {

    private static int N;
    private static int M;
    private static int[] targetArray;
    private static LinkedList<Integer> deque = new LinkedList<>();
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine(), " ");
        targetArray = new int[M];
        for (int i = 0; i < M; i++) {
            targetArray[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int target = targetArray[i];
            int size = deque.size();
            int targetIndex = deque.indexOf(target);

            int halfSize = (deque.size() - 1) / 2;

            if (targetIndex <= halfSize) {
                for (int j = 0; j < targetIndex; j++) {
                    Integer value = deque.removeFirst();
                    deque.addLast(value);
                    count++;
                }
            } else {
                for (int j = 0; j < size - targetIndex; j++) {
                    Integer value = deque.removeLast();
                    deque.addFirst(value);
                    count++;
                }
            }

            deque.removeFirst();
        }

        System.out.println(count);

    }
}
