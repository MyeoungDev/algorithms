package org.algorithms.baekjoon.silver.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_11721 {

    private static final int SIZE = 10;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        if (str.length() <= SIZE) {
            System.out.println(str);
            return;
        } else {
            while (str.length() > SIZE) {
                sb.append(str.substring(0, SIZE));
                str = str.substring(SIZE);
                sb.append('\n');
            }

        }

        sb.append(str);

        System.out.println(sb);

    }
}
