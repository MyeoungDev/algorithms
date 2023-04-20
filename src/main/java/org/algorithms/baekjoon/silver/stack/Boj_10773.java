package org.algorithms.baekjoon.silver.stack;

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
public class Boj_10773 {

    private static final Stack<Integer> stack = new Stack<>();

    private static final int POP_SIGN = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value == POP_SIGN) {
                stack.pop();
            } else {
                stack.push(value);
            }
        }

        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }

}
