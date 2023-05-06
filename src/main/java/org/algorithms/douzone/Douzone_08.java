package org.algorithms.douzone;

import java.util.ArrayList;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_08 {
    public static void main(String[] args) {

        ArrayList<A> arr = new ArrayList<>();
        arr.add(new A("A"));
        arr.add(new A("B"));
        arr.set(0, new A("C"));
        arr.add(new A("D"));

        arr.forEach(System.out::println);
    }

}

class A {
    String data;

    public A(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "A{" +
            "data='" + data + '\'' +
            '}';
    }
}
