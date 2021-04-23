package com.karmerdero;

public class Vertice3D extends Vertice2D{
    double z;

    public Vertice3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double distanceTo(Vertice3D other){
        return Math.sqrt(
                (this.x - other.x) * (this.x - other.x) +
                        (this.y - other.y) * (this.y - other.y) +
                        (this.z - other.z) * (this.z - other.z));
    }

    @Override
    public String toString() {
        return "" + "x=" + x + ", y=" + y + ", z=" + z + ' ';
    }
}
