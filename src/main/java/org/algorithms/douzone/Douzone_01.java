package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_01 {
    public static void main(String[] args) {
        System.out.println(10 & 3 + 8 >> 2);    // 2

        System.out.println(10 & 3);     // 2
        System.out.println(8 >> 2);     // 2

        /**
         * 그러나 연산자 순서에 의하여 비트연산자는 더하기 연산자 보다 순서가 낮다.
         * 즉, 10 & (3 + 8) >> 2 의 값을 출력해야 한다.
         */
    }

    /**
     * | (OR 연산자) - 피연산자 중 한 쪽의 값이 1이면, 1을 결과로 얻는다. 그 외에는 0을 얻는다.
     * & (AND 연산자) - 피연산자 양 쪽이 모두 1이어야만 1을 결과로 얻는다. 그 외에는 0을 얻는다.
     * ^ (XOR 연산자) - 피연산자의 값이 서로 다를 때만 1을 결과로 얻는다. 같을 때는 0을 얻는다.
     * ~ (NOT 연산자) - 0 비트는 1로 변경, 1 비트는 0으로 변경. ex) ~ 0101 => 1010
     * >> (오른쪽 쉬프트) - 오른쪽으로 몇 칸을 미룬다. ex) 1000 >> 2 => 0010
     * << (왼쪽 쉬프트) - 왼쪽으로 몇 칸을 미룬다. ex) 0100 << 2 => 0001 0000
     */



}
