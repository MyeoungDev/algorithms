package org.algorithms.baekjoon.silver.backtracaking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_9742 {
    private static String value;
    private static int targetNumber;
    private static boolean[] used;
    private static String[] sequence;
    private static String[] array;
    private static int count;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static final String INVALID = "No permutation";
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            st = new StringTokenizer(line, " ");
            value = st.nextToken();
            targetNumber = Integer.parseInt(st.nextToken());
            int factorial = factorial(value.length());

            if (targetNumber > factorial) {
                System.out.println(value + " " + targetNumber + " = " + INVALID);
                continue;
            }

            used = new boolean[value.length()];
            sequence = new String[value.length()];
            array = value.split("");
            count = 0;
            backtracking(0, targetNumber);
        }
    }

    private static void backtracking(int depth, int targetNumber) {
        if (depth == value.length()) {
            count++;
            StringBuilder sb = new StringBuilder();
            if (count == targetNumber) {
                sb.append(value).append(" ").append(targetNumber).append(" = ");

                for (int i = 0; i < value.length(); i++) {
                    sb.append(sequence[i]);
                }
                System.out.println(sb);
            }
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (!used[i]) {
                used[i] = true;
                sequence[depth] = array[i];
                backtracking(depth + 1, targetNumber);
                used[i] = false;
            }
        }
    }

    private static int factorial(int n) {
        if (n == 1) {
            return n;
        }

        return n * factorial(n - 1);
    }
}
