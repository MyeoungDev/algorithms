package org.algorithms.douzone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 전문가반 선발 자바 문제
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_18 {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        Object o1 = new Object();
        Object o2 = new Object();

        /**
         * 1번.
         */
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(o1.equals(o2));

        /**
         * 2번
         */
        System.out.println(10 & 3 + 8 >> 2);

        Adder adder = new Adder();
        adder.add(10).print().add(10).add(10).print();

        Car car = new Car();
        System.out.println(car.toString());

        /**
         * 6번
         */

        List<String> str_list = new ArrayList<>();
        str_list.add("A");
        str_list.add("B");
        str_list.add("B");

        str_list.remove(1);
        str_list.set(1, "C");

        for (String str : str_list) {
            System.out.println(str);
        }

        HashSet<HashItem> hash = new HashSet<>();
        hash.add(new HashItem(1, "A"));
        hash.add(new HashItem(2, "B"));
        hash.add(new HashItem(3, "C"));
        hash.add(new HashItem(4, "D"));
        hash.add(new HashItem(4, "E"));
        hash.add(new HashItem(6, "F"));
        hash.add(new HashItem(6, "F"));

        System.out.println(hash);

        List<String> strList = new LinkedList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");

        /**
         * 8번
         */
        ListIterator<String> stringListIterator = strList.listIterator();

        while (stringListIterator.hasNext()) {
            String str = stringListIterator.next(); // 여기서 next를 한번 해버리니까 이전값이 처음부터 있어버리네
            if (stringListIterator.hasPrevious()) {
                System.out.print(":");
            }
            System.out.print(str);
        }

        /**
         * 9번
         */
        System.out.println();

        try {
            FileReader fr = new FileReader(new File("/Users/gwanii/Documents/알고리즘/algorithms/src/main/resources/example.txt"));
            BufferedReader br = new BufferedReader(fr);

            int count = 0;
            while (br.read() != -1) {
                count++;
            }
            System.out.println(count);
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /**
         * 10번.
         */

        System.out.println();
        InterfaceA1 a = new MyClass1();
        InterfaceB1 b = new MyClass1();

        a.foo();
        b.foo();

    }
}


/**
 * 3번
 */
abstract class Base {

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

/**
 * 4번
 */
class Adder {
    private int i = 0;

    public Adder add(int i) {
        this.i += i;
        return this;
    }

    public Adder print() {
        System.out.println("result : " + i);
        return this;
    }
}


/**
 * 5번
 */
class Car {
    private String brand;
    private int maxSpeed;

    public Car() {
        this("Default", 200);
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
            "brand='" + brand + '\'' +
            ", maxSpeed=" + maxSpeed +
            '}';
    }
}

/**
 * 7번
 */

class HashItem {
    private int index;
    private String data;

    public HashItem(int index, String data) {
        this.index = index;
        this.data = data;
    }

    @Override
    public int hashCode() {
        return index % 3;
    }

    @Override
    public boolean equals(Object obj) {
        HashItem temp = (HashItem) obj;
        return this.hashCode() == temp.hashCode();
    }

    @Override
    public String toString() {
        return data;
    }
}

/**
 * 10번
 */
class MyClass1 implements InterfaceA1, InterfaceB1 {
    @Override
    public void foo() {
        if (this instanceof InterfaceA1) {
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

interface InterfaceA1 {
    void foo();
}

interface InterfaceB1 {
    void foo();
}