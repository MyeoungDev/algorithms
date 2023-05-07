package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_11 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        if (sb.hashCode() == "Hello".hashCode()) {
            System.out.println("같다");
        } else {
            System.out.println("틀리다");
        }
    }
}
