package com.joycewong;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
//        System.out.println("Height from the cylinder is " + this.height);
        return this.height;
    }
    public double getVolume(){
        double area = getArea();
        double volume = this.height * area;
//        System.out.println("Volume of cylinder is " + volume);
        return volume;
    }
}
