package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_15 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.live();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("먹다");
    }

    void move() {
        System.out.println("움직이다");
    }

    void live() {
        breath();
        eat();
        move();
    }

    abstract void breath();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("사자 먹다");
    }

    @Override
    void move() {
        System.out.println("사자 움직이다");
    }

    @Override
    void breath() {
        System.out.println("사자 숨쉰다.");
    }
}
