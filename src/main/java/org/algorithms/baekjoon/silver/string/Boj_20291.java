package org.algorithms.baekjoon.silver.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_20291 {
    private static int N;
    private static Map<String, Integer> map = new HashMap<>();
    private static StringTokenizer st;
    private static BufferedReader br;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String key = st.nextToken();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set<String> keySet = map.keySet();

        List<String> sortedKey = keySet.stream()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());

        for (String key : sortedKey) {
            sb.append(key)
                .append(" ")
                .append(map.get(key))
                .append("\n");
        }

        System.out.println(sb);

    }
}
