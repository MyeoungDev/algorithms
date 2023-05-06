package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_05 {
    public static void main(String[] args) {
        InterfaceA a = new MyClass();
        InterfaceB b = new MyClass();

        a.foo();
        b.foo();
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void foo() {
        if (this instanceof InterfaceA) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }

    public void foo(int i) throws Exception {

        if (i == 0) {
            throw new Exception();
        }
    }

}

interface InterfaceA {
    void foo();
}

interface InterfaceB {
    void foo();
}

