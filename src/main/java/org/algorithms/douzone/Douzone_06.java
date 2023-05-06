package org.algorithms.douzone;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_06 {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = "java";
        String s3 = "java";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        // 이 경우를 보면 s2와 s3모두 동일한 hash값을 가진다. 즉, 주소값이 동일하다.

        Object o1 = new Object();

        /**
         * Java에서 Object class 는 모든 클래스의 최고 조상이다.
         * 해당 Object 클래스 안에는 모든 인스턴스가 가져야 할 기본적인 메서드들이 존재한다 (equals(), hashcode(), finalize() 등등)
         *
         * equals()
         * equals 메서드는 참조변수 값과 동일성을 비교하는 메서드이다.
         * 이때, 객체를 비교할 경우 해당 객체의 주소값을 비교하기 때문에, 서로 다른 두 객체를 비교하게 되면 항상 false를 반환한다.
         * 그 이유는, 객체를 생성할 때, 메모리의 비어있는 공간을 찾아 생성하므로 서로 다른 두 객체가 같은 주소를 갖는 일은 존재하지 않는다.
         * 단, 두 객체가 하나의 주소값을 가르키고 있는 경우는 가능하다.
         * ex) - Value v1 = new Value(), Value v2 = new Value(), v2 = v1; 이 경우는 true를 반환할 것이다.
         * 즉, Object 의 equals() 메서드는 두 개의 객체의 주소값만을 비교하는 것 밖에 존재 하지 않는다.
         *
         *
         * hashcode()
         * 이 메서드는 해싱(hashing)기법에 사용되는 '해시함수(hash function)'을 구현한 것이다.
         * Object 클래스의 hashcode()는 객체의 주소값을 hashcode로 변환하여 반환하기 때문에 서로 다른 두 객체가 같은 해시코드를 가질 수 없다.
         * 단, 32bit JVM은 위의 말이 맞지만, 64bit JVM은 중복될 수 있다고 한다.
         *
         * 그런데, String의 경우 hashcode()를 호출하게 되면 서로 내용이 같은 경우 같은 값이 나온다.
         * 이는 String class에서 hashcode()를 override 받아서 String 값을 통해 해시코드를 반환하도록 구현되어있다.
         *
         * 그러나 System.identiyHashCode(Object o)는 Object 클래스의 hashcode 처럼 객체의 주소값으로 해시코드를 생성해서 반환한다.
         * 이는 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장한다.
         */

        /**
         * String 클래스
         *
         * 변경 불가능한(immutable)클래스 이다.
         *
         * String 클래스에는 문자열을 저장하기 위해서 문자형 배열 참조변수(char[]) value를 인스턴스 변수로 정의해놓고 있다.
         * 인스턴스 생성 시 생성자의 매개변수로 입력받는 문자열은 이 인스턴스 변수에 문자형 배열(char[])로 저장되는 것이다.
         *
         * public final class String
         *     implements java.io.Serializable, Comparable<String>, CharSequence {
         *
         * 한번 생성된 String 인스턴스가 갖고 이쓴 문자열은 읽어 올 수만 있고, 변경할 수는 없다.
         * 예를 들어 String a = "a"; String b = "b"; a = a + b; 의 경우는
         * a의 인스턴스를 변경하는 것이 아닌 "ab" 라는 인스턴스를 새롭게 만들고 그것을 a가 가르키는 것이 된다.
         *
         * String str1 = "abc"; // 문자열 리터럴 "abc"의 주소가 str1에 저장됨
         * String str2 = "abc"; // 문자열 리터럴 "abc"의 주소가 str2에 저장됨
         * String str3 = new String("abc"); // 새로운 String 인스턴스 생성
         * String str4 = new String("abc"); // 새로운 String 인스턴스 생성
         *
         * new 연산자를 이용해 생성한 String의 경우 소랩고 메모리할당이 이뤄지면서 새로운 인스턴스가 생성되는 것이고,
         * 문자열 리터럴의 경우 이미 존재하는 "abc"라는 인스턴스의 주소를 재상용해 해당 변수가 가르키게 되는 것이다.
         *
         *
         *
         */
    }
}
