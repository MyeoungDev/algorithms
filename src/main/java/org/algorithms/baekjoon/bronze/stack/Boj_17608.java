package org.algorithms.baekjoon.bronze.stack;

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
public class Boj_17608 {

    private static final Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int count = 1;
        Integer prevStick = stack.pop();
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            if (prevStick < pop) {
                count++;
                prevStick = pop;
            }
        }

        System.out.println(count);

    }
}
