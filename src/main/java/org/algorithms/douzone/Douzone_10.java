package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_10 {
    public static void main(String[] args) {
        A0 a = new A0();
        a.m(1);
        B0 b = new B0();
        b.m(1);

        a = b;
        a.m(1);
        b.m(0.1);
    }
}


class A0 {
    public void m(int i) {
        System.out.println("A.m(int)");
    }

    public void m(double f) {
        System.out.println("A.m(double)");
    }

}

class B0 extends A0 {
    public void m(int i) {
        System.out.println("B.m(int)");
    }

    public void m() {
        System.out.println("B.m()");
    }
}