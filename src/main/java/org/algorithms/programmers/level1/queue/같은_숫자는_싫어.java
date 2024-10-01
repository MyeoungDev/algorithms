package org.algorithms.programmers.level1.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class 같은_숫자는_싫어 {
    public static void main(String[] args) {

    }

    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (queue.isEmpty()) {
                queue.add(arr[i]);
                continue;
            }

            if (arr[i] != arr[i - 1]) {
                queue.offer(arr[i]);
            }
        }

        return queue.stream()
            .mapToInt(o -> o)
            .toArray();
    }
}
