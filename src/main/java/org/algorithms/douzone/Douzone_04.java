package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_04 implements Colorable {

    /**
     * 정답
     */
    @Override
    public void printColor(String color) {
        System.out.println("Yellow");
    }


    /**
     * 오답
     */
    public void printColor() {
        System.out.println("Yellow");
    }

    /**
     * 인터페이스의 경우 해당 메서드를 무조건 Override 해서 구현해 줘야 한다.
     *
     * 이 경우에는 interface 와 abstract class 의 차이를 명확히 정리하고 가자.
     *
     * abstract class => 미완성된 설계도
     * 공통적인 부분을 abstract method로 비어있는 메서드를 작성하고 상속받는 클래스들한테 위임하여 각 할일을 재정의 하여 작성하게 한다.
     * 이때, abstract class 는 일반 class 와 똑같이 생성자, 변수, 메서드 등을 가질 수 있다.
     *
     * interface => 기본 설계도 일종의 추상클래스 이지만, 추상화 정도가 더 높다.
     * 오직 추상메서드와 상수만을 멤버로 가질 수 있으며, 그 외의 다른 어떠한 요소도 허용하지 않는다.
     * 단, Java에서 상속은 하나까지만 지원하고, 구현은 여러개가 가능하다.
     * 즉, extends 는 오직 한개만 가능하고, implement 는 여러개가 가능하다.
     *
     * 인터페이스의 장점 - 개발시간 단축, 표준화 가능, 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다., 독립적인 프로그래밍 가능
     *
     * 또한, 캡슐화와 추상화에 대해 명확한 구현이 가능하다.
     * 상위 인스턴스 타입으로 변환이 가능하다 - 추상화
     * 인터페이스의 선언된 메서드만 보고 그 안에 구현은 몰라도 사용이 가능하다 - 캡슐화
     *
     */

}


interface Colorable {
    void printColor(String color);
}