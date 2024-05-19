package org.algorithms.baekjoon.bronze.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_1259 {
    private static final String END_CONDITION = "0";
    private static final String NO = "no";
    private static final String YES = "yes";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while (!(line = br.readLine()).equals(END_CONDITION)) {
            if (line.startsWith(END_CONDITION)) {
                sb.append(NO);
                sb.append("\n");
                return;
            }

            if (line.length() % 2 == 0) {
                evenNumber(sb, line);
            } else {
                oddNumber(sb,line);
            }
        }
        System.out.println(sb);
    }

    // 홀수 재귀
    private static void oddNumber(StringBuilder sb, String line) {
        if (line.length() == 1) {
            sb.append(YES);
            sb.append("\n");
            return;
        }

        if (yesCondition(line)) {
            oddNumber(sb, line.substring(1, line.length() - 1));
        } else {
            sb.append(NO);
            sb.append("\n");

        }
    }

    // 짝수 재귀
    private static void evenNumber(StringBuilder sb, String line) {
        if (line.isEmpty()) {
            sb.append(YES);
            sb.append("\n");
            return;
        }

        if (yesCondition(line)) {
            evenNumber(sb, line.substring(1, line.length() - 1));
        } else {
            sb.append(NO);
            sb.append("\n");
        }
    }

    private static boolean yesCondition(String line) {
        return line.substring(0, 1).equals(line.substring(line.length() - 1));
    }
}
