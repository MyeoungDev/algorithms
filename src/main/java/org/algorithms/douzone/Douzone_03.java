package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_03 {
    public static void main(String[] args) {
        /**
         * Q. main 메서드에 왜 반드시 static 키워드가 붙어야 할까?
         */

        /**
         * A. JVM의 메모리 영역에 대한 이해가 필요하다.
         * JVM은 크게 Method Area, Stack Area, Heap Area 가 존재한다.
         * Method 영역 : JVM이 동작하여 클래스 로딩(java 파일을 .class 파일로 변환하고 읽어들이는 과정)시에 할당되어
         * 상수(static, final, constant) 등이 저장되고 관리된다.
         * 또한, 어플리케이션이 종료될 때 사라지게 된다.
         * 모든 쓰레드가 공유하는 자원이다.
         *
         * Heap 영역: GC의 주요 대상이된다. new Object() 형식으로 생긴 객체나 배열이 저장되었다가 사라지는 공간이다.
         *
         * Stack 영역: 메서드의 지역변수, 파라미터, 리턴값 등이 Stack 공간에 쌓이고 해당 메서드가 종료시에 사라진다.
         * 실해되는 하나의 쓰레드가 사용하는 공간.
         *
         *
         * 그렇다면 public static void main(String[] args) 해당 메인 메서드는 JVM의 Method 영역에 할당되게 된다.
         * JVM의 Method 영역에 존재하는 값들은 인스턴스의 생성없이 바로 참조하여 실행이 가능하게 된다.
         * 즉, 어플리케이션의 시작점인 main()메서드의 경우 클래스 로딩 직 후, 올라가 있는 main()이라는 이름의 메서드를 찾아서 호출해주게 되는 거다.
         *
         * 만약, main() 메서드가 Method 영역에 존재하지 않는다면? 즉, static method 가 아니게 된다면?
         * main 메서드를 실행하려고 하는데 해당 정보는 메모리에 존재 하지 않게 된다.
         * 그러므로 실행해야되는 메서드를 찾지 못하게 되고 이때는 NoSuchMethodException main 이라는 에러를 뱉게 되는 거다.
         */
    }
}
