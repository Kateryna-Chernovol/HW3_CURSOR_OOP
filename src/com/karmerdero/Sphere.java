package com.karmerdero;

import java.util.ArrayList;

public class Sphere extends SpaceShape{
    private final double radius;

    public Sphere(Vertice3D a, double radius) {
        vertice3D = new ArrayList<>();
        vertice3D.add(a);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}
