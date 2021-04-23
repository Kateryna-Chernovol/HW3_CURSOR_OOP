package com.karmerdero;

import java.util.ArrayList;

public class Circle extends PlaneShape{
    public Circle(Vertice2D c, Vertice2D r) { // r = radius
        vertices = new ArrayList<>();
        vertices.add(c);
        vertices.add(r);
    }

    @Override
    public double getArea() {
        Vertice2D c = vertices.get(0);
        Vertice2D r = vertices.get(1);
        return Math.PI * c.distanceTo(r) + c.distanceTo(r);
    }

    @Override
    public double getPerimeter() {
        Vertice2D c = vertices.get(0);
        Vertice2D r = vertices.get(1);
        return Math.PI * c.distanceTo(r) * c.distanceTo(r);
    }
}
