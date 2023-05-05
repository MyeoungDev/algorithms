package org.algorithms.douzone.shape;

/**
 * Some description here.
 *
 * @author : 강명관
 * @since : 1.0
 **/
public class RecTriangle extends Shape{

    private double width;
    private double height;

    public RecTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        double line = Math.sqrt(this.width * this.width + this.height * this.height);
        return this.width + this.height + line;
    }

}
