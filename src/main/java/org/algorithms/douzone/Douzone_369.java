package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_369 {

    private static final StringBuilder sb = new StringBuilder();

    private static final char[] arr = {'3', '6', '9'};
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            boolean result = solution(i);
            if (result) {
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }

    private static boolean solution(int number) {

        int condition = number;
        boolean signal = false;

        while (condition > 0) {
            int temp = condition % 10;

            if (temp % 3 == 0) {
                if (!signal) {
                    signal = true;
                    sb.append(number).append(' ');
                }
                sb.append("짝");
            }

            condition = condition / 10;
        }

        return signal;
    }
}
