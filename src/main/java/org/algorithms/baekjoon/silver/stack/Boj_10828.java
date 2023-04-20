package org.algorithms.baekjoon.silver.stack;

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
public class Boj_10828 {

    private static final List<Integer> stack = new ArrayList<>();

    private static StringTokenizer st;

    private static final StringBuilder sb = new StringBuilder();

    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String TOP = "top";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StackFactory.factory(br.readLine());
        }

        System.out.println(sb);
    }

    static class StackFactory {
        public static void factory(String line) {

            st = new StringTokenizer(line, " ");
            String command = st.nextToken();

            if (command.equals(PUSH)) {
                push(Integer.parseInt(st.nextToken()));
            } else if (command.equals(POP)) {
                int pop = pop();
                sb.append(pop).append('\n');
            } else if (command.equals(SIZE)) {
                int size = size();
                sb.append(size).append('\n');
            } else if (command.equals(EMPTY)) {
                int empty = empty();
                sb.append(empty).append('\n');
            } else if (command.equals(TOP)) {
                int top = top();
                sb.append(top).append('\n');
            }
        }

        private static void push(int value) {
            stack.add(value);
        }

        private static int size() {
            return stack.size();
        }

        private static int top() {
            if (empty() == 1) {
                return -1;
            }

            return stack.get(size() - 1);
        }

        private static int empty() {
            if (stack.isEmpty()) {
                return 1;
            } else {
                return 0;
            }
        }

        private static int pop() {
            if (empty() == 1) {
                return -1;
            }

            return stack.remove(size() - 1);
        }

    }


}
