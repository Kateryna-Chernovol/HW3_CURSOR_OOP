package com.karmerdero;

import java.util.ArrayList;

public class Cuboid extends SpaceShape{
    private final double cuboidWidth, cuboidHeight, cuboidDepth;

    public Cuboid(Vertice3D a, double cuboidWidth, double cuboidHeight, double cuboidDepth) {
        vertice3D = new ArrayList<>();
        vertice3D.add(a);
        this.cuboidWidth = cuboidWidth;
        this.cuboidHeight = cuboidHeight;
        this.cuboidDepth = cuboidDepth;
    }

    @Override
    public double getArea() {
        return 2 * (cuboidWidth * cuboidHeight + cuboidWidth * cuboidDepth + cuboidHeight * cuboidDepth);
    }

    @Override
    public double getVolume() {
        return cuboidWidth * cuboidHeight * cuboidDepth;
    }
}
