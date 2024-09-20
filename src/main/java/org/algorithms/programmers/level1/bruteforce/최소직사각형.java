package org.algorithms.programmers.level1.bruteforce;

import java.util.Arrays;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class 최소직사각형 {

    public int solution(int[][] sizes) {

        int maxWidth = 0;
        int maxHeight = 0;

        for(int[] size : sizes) {
            Arrays.sort(size);
            maxWidth = Math.max(maxWidth, size[0]);
            maxHeight = Math.max(maxHeight, size[1]);
        }

        return maxWidth * maxHeight;
    }
}
