package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_13 {
    public static void main(String[] args) {
        A1 a1 = new A1("A");
        f(a1);
        g(a1);
        h(a1);

        a1.printMe();
    }

    static A1 f(A1 a1) {
        a1 = new A1("B");
        return a1;
    }

    static void g(A1 a1) {
        a1.setString("C");
    }

    static void h(A1 a1) {
        a1 = new A1("D");
    }
}

class A1 {
    String str;
    A1(String str) {
        this.str = str;
    }

    void setString(String str) {
        this.str = str;
    }

    void printMe() {
        System.out.println(str);
    }
}