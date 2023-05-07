package org.algorithms.douzone;

import java.util.ArrayList;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_14 {
    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        Bird b2 = new Chicken();

        print(b1);
        print(b2);

    }

    static void print(Bird bird) {
        if (bird instanceof Bird) {
            System.out.println("A");
        }

        if (bird instanceof Sparrow) {
            System.out.println("B");
        }

        if (bird instanceof Chicken) {
            System.out.println("C");
        }
    }

}

interface Bird {

}

class Sparrow implements Bird{

}

class Chicken implements   Bird{

}