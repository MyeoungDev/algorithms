package org.algorithms.baekjoon.gold.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_2493 {
    private static StringTokenizer st;
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        Stack<Integer> stack = new Stack<>();

        while (st.hasMoreTokens()) {
            stack.push(Integer.parseInt(st.nextToken()));
        }


        Stack<Integer> resultStack = new Stack<>();
        for (int i = 0; i < N; i++) {
            resultStack.push(getReceiverIndex(stack));
        }

        while (resultStack.size() != 1) {
            sb.append(resultStack.pop()).append(' ');
        }

        sb.append(resultStack.pop());

        System.out.println(sb);

    }

    private static int getReceiverIndex(Stack<Integer> stack) {

        if (stack.isEmpty() || stack.size() == 1) {
            return 0;
        }

        Integer pop = stack.pop();

        Stack<Integer> popStack = new Stack<>();

        while (!stack.isEmpty()) {
            Integer temp = stack.peek();
            if (temp >= pop) {

                int receiverIndex = stack.size();

                while (!popStack.isEmpty()) {
                    stack.push(popStack.pop());
                }

                return receiverIndex;
            }

            popStack.push(stack.pop());
        }


        return 0;
    }
}
