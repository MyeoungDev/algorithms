package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_12 {
    public static void main(String[] args) {
        int i = 0;
        while (!foo(++i)) {
            System.out.println(i + i);
        }
    }

    static boolean foo(int n) {
        return n % 4 == 0;
    }
}
