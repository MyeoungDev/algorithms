package org.algorithms.baekjoon.gold.bruteforce;

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
public class Boj_16938 {

    private static int N;
    private static int L;
    private static int R;
    private static int X;
    private static List<Integer> numbers = new ArrayList<>();
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int count = 0;
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        backtracking(0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        System.out.println(count);

    }

    private static void backtracking(int index, int sum, int max, int min, int numProblems) {
        if (index == N) {
            if (numProblems >= 2 && sum >= L && sum <= R && (max - min) >= X) {
                count++;
            }
            return;
        }

        backtracking(
            index + 1,
            sum + numbers.get(index),
            Math.max(max, numbers.get(index)),
            Math.min(min, numbers.get(index)),
            numProblems + 1
        );

        backtracking(index + 1, sum, max, min, numProblems);
    }



}
