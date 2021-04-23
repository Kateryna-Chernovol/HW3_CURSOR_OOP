package com.karmerdero;

import java.util.ArrayList;

public class Triangle extends PlaneShape{
    public Triangle(Vertice2D a, Vertice2D b, Vertice2D c) {
        vertices = new ArrayList<>();
        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
    }

    @Override
    public double getArea() {
        double hp = getPerimeter() / 2; // ph is halfPerimeter
        Vertice2D a = vertices.get(0);
        Vertice2D b = vertices.get(1);
        Vertice2D c = vertices.get(2);

        return Math.sqrt
                (hp *
                        (hp - a.distanceTo(b)) *
                        (hp - b.distanceTo(c)) *
                        (hp - c.distanceTo(a))
                );
    }

    @Override
    public double getPerimeter() {
        Vertice2D a = vertices.get(0);
        Vertice2D b = vertices.get(1);
        Vertice2D c = vertices.get(2);
        return a.distanceTo(b) + a.distanceTo(c) + b.distanceTo(c);
    }
}
