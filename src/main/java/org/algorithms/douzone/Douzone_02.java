package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_02 {
    public static void main(String[] args) {
        자동차 A = new 자동차();
        버스 B = new 버스();
        자동차 C = new 스포츠카();
//        스포츠카 D = new 자동차();       컴파일 에러가 난다. 잘못된 상속관계
    }
}

class 자동차 {

}

class 버스 extends 자동차 {

}

class 스포츠카 extends 자동차 {

}
