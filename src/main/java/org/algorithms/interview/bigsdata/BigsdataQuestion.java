package org.algorithms.interview.bigsdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class BigsdataQuestion {
    public static void main(String[] args) throws IOException {

        myAnswer();
        answer();

    }

    private static void myAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        String input = br.readLine();

        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                list.add(Integer.valueOf(temp));
                temp = "";
            } else {
                temp += input.charAt(i);
            }
        }

        if (!temp.equals("")) {
            list.add(Integer.valueOf(temp));
        }

        int sum = 0;
        for (Integer val : list) {
            sum += val;
        }

        System.out.println(sum);
    }

    private static void answer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        String input = br.readLine();

        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                sum += Integer.valueOf(temp);
                temp = "";
            } else {
                temp += input.charAt(i);
            }
        }

        if (!temp.equals("")) {
            sum += Integer.valueOf(temp);
        }

        System.out.println(sum);
    }


}
