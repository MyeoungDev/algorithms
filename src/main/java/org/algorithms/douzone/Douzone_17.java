package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public abstract class Douzone_17 {

    public static void foo() {
        System.out.println("foo()");
    }

    public void goo() {
        System.out.println("goo()");
        foo();
    }

    public abstract void hoo();

    public void moo() {
        hoo();
    }

    public static void noo() {
//        hoo();        // static 메서드는 비 static 메서드를 참조할 수 없다.
//        moo();        // static 메서드는 비 static 메서드를 참조할 수 없다.
    }

}
