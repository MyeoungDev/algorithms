package org.algorithms.programmers.level1.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class 완주하지못한선수 {

    public static void main(String[] args) {
        String[] a = {"mislav", "stanko", "mislav", "ana"};

        String[] b = {"stanko", "ana", "mislav"};
        String solution = solution(a, b);
    }

    public static String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> personMap = new HashMap<>();
        for (int i = 0; i < participant.length; i ++) {
            Integer count = personMap.get(participant[i]);
            if (count == null) {
                personMap.put(participant[i], 1);
            } else {
                personMap.put(participant[i], count + 1);
            }
        }

        for (int i = 0; i < completion.length; i++) {
            Integer count = personMap.get(completion[i]);
            if (count == 1) {
                personMap.remove(completion[i]);
            } else {
                personMap.put(completion[i], count - 1);
            }
        }

        return personMap.keySet().iterator().next();
    }
}
