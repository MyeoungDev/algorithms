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
public class Boj_9012 {

    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(psCheck(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }

    private static String psCheck(String line) {
        Stack<Character> stack = new Stack<>();

        if (line.charAt(0) == ')') {
            return "NO";
        }

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                stack.push(line.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return "YES";
    }
}
