package org.algorithms.baekjoon.silver.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Boj_2304 {

    private static int N;
    private static List<Warehouse> list = new ArrayList<>();
    private static int maxHeight = Integer.MIN_VALUE;
    private static int target;
    private static int result = 0;
    private static BufferedReader br;
    private static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Warehouse(x, y));

            if (y > maxHeight) {
                maxHeight = y;
                target = x;
            }
        }
        result += maxHeight;

        Collections.sort(list, (o1, o2) -> o1.x - o2.x);

        int maxIndex = list.indexOf(new Warehouse(target, maxHeight));

        // 왼쪽 부분 면적 계산
        int leftMaxHeight = list.get(0).y;
        int leftMaxX = list.get(0).x;
        for (int i = 1; i <= maxIndex; i++) {
            Warehouse current = list.get(i);
            if (current.y > leftMaxHeight) {
                leftMaxHeight = current.y;
            }
            result += leftMaxHeight * (current.x - leftMaxX);
            leftMaxX = current.x;
        }

        // 오른쪽 부분 면적 계산
        int rightMaxHeight = list.get(list.size() - 1).y;
        int rightMaxX = list.get(list.size() - 1).x;
        for (int i = list.size() - 2; i > maxIndex; i--) {
            Warehouse current = list.get(i);
            if (current.y > rightMaxHeight) {
                rightMaxHeight = current.y;
            }
            result += rightMaxHeight * (rightMaxX - current.x);
            rightMaxX = current.x;
        }

        // 가장 높은 기둥의 면적 추가
        result += maxHeight + (rightMaxX - leftMaxHeight);

        // 최종 면적 출력
        System.out.println(result);
    }

    static class Warehouse {
        private int x;
        private int y;

        public Warehouse(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Warehouse warehouse = (Warehouse) o;
            return x == warehouse.x && y == warehouse.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Warehouse{" +
                "x=" + x +
                ", y=" + y +
                '}';
        }
    }
}
