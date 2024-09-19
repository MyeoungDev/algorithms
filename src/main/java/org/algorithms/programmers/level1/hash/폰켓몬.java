package org.algorithms.programmers.level1.hash;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class 폰켓몬 {
    public static void main(String[] args) {

    }

    public int solution(int[] nums) {
        int avg = nums.length / 2;
        Set<Integer> a = Arrays.stream(nums)
            .mapToObj(o -> Integer.parseInt(String.valueOf(o)))
            .collect(Collectors.toSet());

        return avg > a.size() ? a.size() : avg;
    }
}
