package com.sust.java.chapter5.demo06;

/**
 * 三角形
 */
public class Triangle extends Shape {

    //三角形的三个边
    private double x;
    private double y;
    private double z;

    public Triangle(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String getType() {
        return "三角形";
    }

    @Override
    public double calPerimeter() {
        return x + y + z;
    }
}
