package org.algorithms.programmers.level2.hash;

import java.util.Arrays;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class 전화번호_목록 {

    public static void main(String[] args) {
    }

    /**
     * 생각해보니 굳이 2중 배열이 돌아갈 이유가 없음.
     * 사전순으로 정렬을 해놓고 왜 2중배열을 했지
     */
    public static boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

    /**
     * 효율성 부분에서 시간복잡도 문제로 실패
     * O(n^2) 이 발생되기 떄문
     */
    public static boolean fail_1(String[] phone_book) {

        Arrays.sort(phone_book, (a, b) -> Integer.compare(a.length(), b.length()));

        for (int i = 0; i < phone_book.length; i++) {
            String p1 = phone_book[i];
            for (int j = i + 1; j < phone_book.length; j++) {
                String p2 = phone_book[j];

                boolean result = p2.startsWith(p1);

                if (result) {
                    return false;
                } else {
                    continue;
                }
            }
        }

        return true;
    }
}
