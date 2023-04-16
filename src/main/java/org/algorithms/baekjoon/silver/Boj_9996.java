package org.algorithms.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_9996 {

    public static StringBuilder sb = new StringBuilder();

    public static final String YES = "DA";
    public static final String NO = "NE";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String pattern = br.readLine();


        StringTokenizer st = new StringTokenizer(pattern, "*");

        String start = st.nextToken();
        String end = st.nextToken();

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();

            if (temp.length() >= start.length() + end.length()) {
                if (temp.startsWith(start) && temp.endsWith(end)) {
                    sb.append(YES);
                } else {
                    sb.append(NO);
                }
            } else {
                sb.append(NO);
            }

            sb.append('\n');
        }

        System.out.println(sb);

    }
}
