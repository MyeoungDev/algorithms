package org.algorithms.programmers.level1.bruteforce;

import java.util.ArrayList;
import java.util.List;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class 모의고사 {

    public int[] solution(int[] answers) {

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {

            if(answers[i] == first[i % first.length]) {
                scores[0]++;
            }

            if (answers[i] == second[i % second.length]) {
                scores[1]++;
            }

            if (answers[i] == third[i % third.length]) {
                scores[2]++;
            }
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> result = new ArrayList<>();
        if (scores[0] == maxScore) result.add(1);
        if (scores[1] == maxScore) result.add(2);
        if (scores[2] == maxScore) result.add(3);

        return result.stream()
            .mapToInt(o -> o)
            .toArray();
    }
}
