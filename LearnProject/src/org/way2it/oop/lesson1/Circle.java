package org.way2it.oop.lesson1;

public class Circle {
    private double radius;
    private double diameter;

    public void SetRadius(double r){
        radius = r;
    }
    public void SetDiameter(double d) {
        diameter = d;
    }
    public double Square() {
        return Math.PI * ((diameter / 2) * (diameter / 2));
    }
    public  double Long() {
        return 2 * Math.PI * radius;
    }

}
