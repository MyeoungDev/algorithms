package org.algorithms.programmers.level2.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class 가장_큰_수 {
    public static void main(String[] args) {
        int[] numbers = new int[] {3, 30, 34, 5, 9};

        String solution = solution(numbers);
        System.out.println(solution);
    }

    public static String solution(int[] numbers) {

        List<String> numberList = Arrays.stream(numbers)
            .mapToObj(o -> String.valueOf(o))
            .collect(Collectors.toList());

        Collections.sort(numberList, (a, b) -> (b + a).compareTo(a + b));

        if(numberList.get(0).equals("0")){
            return "0";
        }

        StringBuilder builder = new StringBuilder();
        for (String num : numberList) {
            builder.append(num);
        }

        return builder.toString();
    }

    public String timeOut_1(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                int prev = numbers[j - 1];
                int next = numbers[j];

                String prevString = String.valueOf(prev);
                String nextString = String.valueOf(next);

                if (Integer.parseInt(prevString + nextString) < Integer.parseInt(nextString + prevString)) {
                    numbers[j - 1] = next;
                    numbers[j] = prev;
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            builder.append(numbers[i]);
        }

        return builder.toString();
    }
}
