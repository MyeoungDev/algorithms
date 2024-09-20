package org.algorithms.programmers.level2.hash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class 의상 {

    public static void main(String[] args) {

    }

    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            Integer count = map.getOrDefault(type, 0);

            map.put(type, count + 1);
        }

        int result = 1;
        for(String type : map.keySet()) {
            result = result * (map.get(type) + 1);
        }

        --result;

        return result;
    }
}
