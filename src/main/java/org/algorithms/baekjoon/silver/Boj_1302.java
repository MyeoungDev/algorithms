package org.algorithms.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_1302 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        int max = 0;

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();

            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }

            if (map.get(temp) > max) {
                max = map.get(temp);
            }
        }

        List<String> maxList = new ArrayList<>();

        for (String key : map.keySet()){
            if (map.get(key) == max) {
                maxList.add(key);
            }
        }

        Collections.sort(maxList);
        System.out.println(maxList.get(0));

    }
}
