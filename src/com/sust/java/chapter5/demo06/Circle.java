package com.sust.java.chapter5.demo06;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Բ";
    }

    @Override
    public double calPerimeter() {
        return 2 * Math.PI + radius;
    }
}
