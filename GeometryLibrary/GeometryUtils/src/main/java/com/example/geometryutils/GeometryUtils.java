package com.example.geometryutils;

import com.example.geometry.Shape;

public class GeometryUtils {
    public static boolean compareAreas(Shape s1, Shape s2) {
        return Double.compare(s1.getArea(), s2.getArea()) == 0;
    }

    public static double convertCmToMeters(double cm) {
        return cm / 100.0;
    }
}