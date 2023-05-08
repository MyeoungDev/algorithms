package org.algorithms.douzone;

import java.util.ArrayList;
import java.util.List;

/**
 * bit-practice-4-5
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Douzone_20 {
    public static void main(String[] args) {

        /**
         * 1번.
         */
//        int array[] = { 5, 9, 3, 8, 60, 20, 1 };
//        int temp = 0;
//        int count = array.length;
//        System.out.println( "Before sort." );
//        for (int i = 0; i < count; i++) { System.out.print( array[ i ] + " " );
//        }
//
//        for (int i = 0; i < count; i++) {
//            for (int j = i + 1; j < count; j++) {
//                if (array[i] > array[j]) {
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//
//        System.out.println(); System.out.println();
//        System.out.println( "After Sort." );
//        for (int i = 0; i < count; i++) {
//            System.out.print( array[ i ] + " " );
//        }

        Phone phone = new SmartPhone();
        phone.execute("음악"); phone.execute("통화"); phone.execute("앱");

        Bird1 bird01 = new Duck1(); bird01.setName( "꽥꽥이" ); bird01.fly();
        bird01.sing(); System.out.println( bird01 );
        Bird1 bird02 = new Sparrow1(); bird02.setName( "짹짹이" ); bird02.fly();
        bird02.sing(); System.out.println( bird02 );


        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow2() );
        printSound( new Duck2() );

        try {
            MyStack stack = new MyStack(3); stack.push("Hello"); stack.push("World"); stack.push("!!!"); stack.push("java"); stack.push(".");
            while (stack.isEmpty() == false) { String s = stack.pop(); System.out.println( s );
            } System.out.println("======================================");
            stack = new MyStack(3); stack.push("Hello");
            System.out.println(stack.pop()); System.out.println(stack.pop());
        } catch ( MyStackException ex) { System.out.println( ex );
        }

        List<Shape> list = new ArrayList<Shape>();
        list.add( new Rectangle(5, 6) ); list.add( new RectTriangle( 6, 2) );
        for( Shape shape : list ) {
            System.out.println( "area:" + shape.getArea() ); System.out.println( "perimeter:" + shape.getPerimeter() );
            if( shape instanceof Resizable ) {
                Resizable resizable = (Resizable) shape;
                resizable.resize( 0.5 );
                System.out.println( "new area:" + shape.getArea() ); System.out.println( "new perimeter:" + shape.getPerimeter() );
            } }

    }

    private static void printSound( Soundable soundable ) { System.out.println( soundable.sound() );
    }
}

class MusicPhone extends Phone {
    @Override
    public void execute( String function ) {
        if ( function.equals("음악") ) { playMusic();
            return; }
        super.execute( function ); }
    protected void playMusic() { System.out.println("MP3 플레이어에서 음악재생");
    } }

class Phone {
    public void execute( String function ) {
        call(); }
    private void call(){ System.out.println( "통화기능시작" );
    } }
class SmartPhone extends MusicPhone {
    @Override
    public void execute(String function) {
        if ("음악".equals(function)) { playMusic();
            return; }
        if ("앱".equals(function)) { playApp();
            return; }
        super.execute(function); }
    @Override
    protected void playMusic() {
        System.out.println("다운로드해서 음악재생"); }
    public void playApp() { System.out.println("앱실행");
    }
}

abstract class Bird1 { protected String name;
    public void setName(String name) { this.name = name;
    }
    public abstract void fly(); public abstract void sing();
}

class Duck1 extends Bird1 {
    @Override
    public void fly() {
        System.out.println("오리(" + name + ")는 날지 않습니다.");
    }
    @Override
    public void sing() {
        System.out.println("오리(" + name + ")가 소리내어 웁니다."); }
    @Override
    public String toString() {
        return "오리의 이름은 " + name + "입니다";
    } }
class Sparrow1 extends Bird1 {
    @Override
    public void fly() {
        System.out.println("참새(" + name + ")가 날아다닙니다."); }
    @Override
    public void sing() {
        System.out.println("참새(" + name + ")가 소리내어 웁니다."); }
    @Override
    public String toString() {
        return "참새의 이름은 " + name + "입니다."; }
}

interface Soundable {
    public String sound();
}
class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹"; }
}
class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍"; }
}
class Duck2 implements Soundable {
    @Override
    public String sound() {
        return "꽥꽥"; }
}

class Sparrow2 implements Soundable {
    @Override
    public String sound() {
        return "짹짹"; }
}

class MyStackException extends RuntimeException { }

class MyStack {
    private int top;
    private String[] buffer;
    @SuppressWarnings("unchecked") public MyStack(int capacity) {
        buffer = new String[capacity];
        top = -1; }
    public void push(String s) {
        if (top == buffer.length - 1) {
            growableArray();
        }
        buffer[++top] = s;
    }
    public String pop() throws MyStackException { if (top == -1) {
        throw new MyStackException(); }
        String result = buffer[top]; buffer[top] = null;
        top--;
        return result;
    }
    public boolean isEmpty() { return top == -1;
    }
    public void growableArray() {
        String[] newArr = new String[buffer.length * 2]; for (int i = 0; i < buffer.length; i++) {
            newArr[i] = buffer[i]; }
        buffer = newArr;
    }
}

class Rectangle extends Shape implements Resizable {
    public Rectangle(double w, double h) { super(w, h);
    }
    @Override
    public void resize(double rate) {
        width *= rate;
        height *= rate;
    }
    @Override
    double getArea() {
        return width * height;
    }
    @Override
    double getPerimeter() {
        return (width + height) * 2; }
}
class RectTriangle extends Shape {
    public RectTriangle(double w, double h) { super(w, h);
    }
    @Override
    double getArea() {
        return width * height * 0.5;
    }
    @Override
    double getPerimeter() {
        double x = Math.pow(width, 2) + Math.pow(height, 2);
        return width + height + Math.sqrt(x); }
}
interface Resizable {
    public void resize(double rate);
}

abstract class Shape {
    protected double width; protected double height;
    public Shape(double width, double height) { this.width = width;
        this.height = height;
    }
    abstract double getArea(); abstract double getPerimeter();
}