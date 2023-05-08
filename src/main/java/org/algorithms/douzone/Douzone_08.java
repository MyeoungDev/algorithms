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

        ArrayList<A> list = new ArrayList<>();
        list.add(new A("1"));
        list.add(new A("2"));
        list.set(0, new A("0"));
        list.add(0, new A("10"));

        System.out.println();

        list.forEach(System.out::println);


        StringBuilder sb = new StringBuilder("hello");
        String str = "hello";
        String str1 = "hello";
        System.out.println(str.hashCode() == str1.hashCode());
        System.out.println(sb.hashCode() == str1.hashCode());
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
