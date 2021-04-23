package com.karmerdero;

import java.util.List;

public abstract class PlaneShape implements PerimeterMeasurable, AreaMeasurable{
    protected List<Vertice2D> vertices;
}
