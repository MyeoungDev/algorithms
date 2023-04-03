package org.algorithms.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_9086 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());



        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            sb.append(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length() - 1)));
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
