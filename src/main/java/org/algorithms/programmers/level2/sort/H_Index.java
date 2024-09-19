package org.algorithms.programmers.level2.sort;

import java.util.Arrays;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class H_Index {
    public static void main(String[] args) {

    }

    public static int solution(int[] citations) {
        Arrays.sort(citations); // 배열을 오름차순으로 정렬
        int n = citations.length; // 논문 수
        int hIndex = 0; // 초기 H-Index 설정

        for (int i = 0; i < n; i++) {
            int h = n - i; // 현재 인덱스 i를 기준으로 계산한 H-Index 후보
            if (citations[i] >= h) { // 현재 논문의 인용 횟수가 H-Index 후보 h 이상인 경우
                hIndex = h; // H-Index를 업데이트
                break; // 찾은 경우 더 이상 확인할 필요 없음
            }
        }

        return hIndex; // 최종 H-Index 반환
    }
}
