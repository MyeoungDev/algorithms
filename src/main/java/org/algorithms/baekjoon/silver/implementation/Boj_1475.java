package org.algorithms.baekjoon.silver.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_1475 {

    private static int[] NUMBER_SET = new int[10];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();

        for (int i = 0; i < roomNumber.length(); i++) {
            int eachRoomNumber = roomNumber.charAt(i) - '0';

            NUMBER_SET[eachRoomNumber] = NUMBER_SET[eachRoomNumber] + 1;
        }

        int sixNineCount = NUMBER_SET[6] + NUMBER_SET[9];
        int sixNineAverage = (sixNineCount + 1) / 2;
        NUMBER_SET[6] = sixNineAverage;
        NUMBER_SET[9] = sixNineAverage;

        int max = 0;
        for (int i = 0; i < NUMBER_SET.length; i++) {
            max = Math.max(max, NUMBER_SET[i]);
        }

        System.out.println(max);

//        int max2 = Arrays.stream(NUMBER_SET).max().orElse(0);
//        System.out.println(max2);
    }
}
