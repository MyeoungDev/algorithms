package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_09 {
    public static void main(String[] args) {
        C c = new C();

        I3 i3 = c;
        I4 i4 = c;
        I1 i1 = c;
        I2 i2 = i3;

        i3.m1();
        i3.m2();
        i3.m3();
//        i3.m4();   // i3 는 I3의 형태이다. 즉, m4()라는 메서드를 갖고있지 않다.
    }
}

interface I1 {
    void m1();
}


interface I2 {
    void m2();
}

interface I3 extends I1, I2 {
    void m3();
}

interface I4 {
    void m4();
}

class C implements I3, I4 {
    @Override
    public void m1() {
        System.out.println("m1()");
    }

    @Override
    public void m2() {
        System.out.println("m2()");
    }

    @Override
    public void m3() {
        System.out.println("m3()");
    }

    @Override
    public void m4() {
        System.out.println("m4()");
    }
}

