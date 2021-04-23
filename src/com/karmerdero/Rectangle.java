package com.karmerdero;

import java.util.ArrayList;

public class Rectangle extends PlaneShape {
    private final double rectangleWidth;
    private final double rectangleHeight;

    public Rectangle(Vertice2D a, double rectangleWidth, double rectangleHeight) {
        vertices = new ArrayList<>();
        vertices.add(a);
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    public double getArea() {
        return rectangleWidth * rectangleHeight;
    }

    @Override
    public double getPerimeter() {
        return (rectangleWidth + rectangleHeight) * 2 ;
    }
}
