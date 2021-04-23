package com.karmerdero;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task#1 \n2D Shape" + "\n");
        Triangle triangle2D = new Triangle(
                new Vertice2D(2,2),
                new Vertice2D(0,0),
                new Vertice2D(2,-2));
        System.out.println("Triangle perimeter is: " +
                String.format("%.3f",triangle2D.getPerimeter()));
        System.out.println("Triangle area is: " +
                String.format("%.3f",triangle2D.getArea()) + "\n");

        Rectangle rectangle2D = new Rectangle(
                new Vertice2D(1,4),
                4,
                2);
        System.out.println("Rectangle perimeter is: " +
                String.format("%.3f",rectangle2D.getPerimeter()));
        System.out.println("Rectangle area is: " +
                String.format("%.3f",rectangle2D.getArea()) + "\n");

        Circle circle2D = new Circle(
                new Vertice2D(1,3),
                new Vertice2D(2,-3));
        System.out.println("Circle perimeter is: " +
                String.format("%.3f",circle2D.getPerimeter()));
        System.out.println("Circle area is: " +
                String.format("%.3f",circle2D.getArea()) + "\n");

        System.out.println("Task#1 \n3D Shape" + "\n");
        SquarePyramid pyramid = new SquarePyramid(
                new Vertice3D(0,0,0),
                4,
                8);
        System.out.println("Square pyramid area is: " +
                String.format("%.3f",pyramid.getArea()));
        System.out.println("Square pyramid volume is: " +
                String.format("%.3f",pyramid.getVolume()) + "\n");

        Cuboid cuboid = new Cuboid(
                new Vertice3D(0,0,0),
                2,
                4,
                6 );
        System.out.println("Cuboid area is: " +
                String.format("%.3f",cuboid.getArea()));
        System.out.println("Cuboid volume is: " +
                String.format("%.3f",cuboid.getVolume()) + "\n");

        Sphere sphere = new Sphere(
                new Vertice3D(0,0,0), 5);
        System.out.println("Sphere area is: " +
                String.format("%.3f",sphere.getArea()));
        System.out.println("Sphere volume is: " +
                String.format("%.3f",sphere.getVolume()));

    }
}
