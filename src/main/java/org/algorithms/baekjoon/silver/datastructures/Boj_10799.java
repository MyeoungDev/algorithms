package org.algorithms.baekjoon.silver.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_10799 {
    private static Stack<String> stack = new Stack<>();
    private static BufferedReader br;
    private static final String OPEN = "(";
    private static final String CLOSE = ")";
    private static final String LASER = "=";
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));


        String[] split = br.readLine().split("");
        int totalPieces = 0;
        for (int i = 0; i < split.length; i++) {
            String current = split[i];

            if (current.equals(OPEN)) {
                stack.push(current);
            } else {
                stack.pop();
                if (split[i - 1].equals(OPEN)) {
                    totalPieces += stack.size();
                } else {
                    totalPieces += 1;
                }
            }
        }

        System.out.println(totalPieces);

    }
}
