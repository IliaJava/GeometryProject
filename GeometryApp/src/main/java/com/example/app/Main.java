package com.example.app;


import com.example.geometry.*;
import com.example.threed.Cube;
import com.example.threed.Sphere;
import com.example.threed.ThreeDShape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        printInfo("Circle", circle);
        printInfo("Rectangle", rectangle);
        printInfo("Triangle", triangle);

        ThreeDShape cube = new Cube(3);
        ThreeDShape sphere = new Sphere(4);

        System.out.println("Cube volume = " + cube.getVolume());
        System.out.println("Cube surface area = " + cube.getSurfaceArea());

        System.out.println("Sphere volume = " + sphere.getVolume());
        System.out.println("Sphere surface area = " + sphere.getSurfaceArea());

    }

    private static void printInfo(String name, Shape shape) {

        System.out.println(shape.getDescription());
        System.out.println(name + ":");
        System.out.println("Area = " + shape.getArea());
        System.out.println("Perimeter = " + shape.getPerimeter());
        System.out.println();
    }


}