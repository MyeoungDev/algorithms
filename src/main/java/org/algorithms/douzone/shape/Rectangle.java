package org.algorithms.douzone.shape;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class Rectangle extends Shape implements Resizable{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width * 2) + (height * 2);
    }

    @Override
    public double resize(double rate) {
        this.width = this.width * rate;
        this.height = this.height * rate;

        return this.width * this.height;
    }
}
