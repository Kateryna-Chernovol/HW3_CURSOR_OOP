package com.karmerdero;

import java.util.ArrayList;

public class SquarePyramid extends SpaceShape{
    private final double baseWidth, pyramidHeight;

    public SquarePyramid (Vertice3D baseСenter, double baseWidth, double pyramidHeight){
        vertice3D = new ArrayList<>();
        vertice3D.add(baseСenter);
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        double apothem = Math.sqrt(Math.pow(pyramidHeight, 2) + Math.pow(baseWidth / 2, 2));
        return Math.pow(baseWidth, 2) + (2 * baseWidth * apothem);
    }

    @Override
    public double getVolume() {
        return (Math.pow(baseWidth, 2) * pyramidHeight) / 3;
    }
}
