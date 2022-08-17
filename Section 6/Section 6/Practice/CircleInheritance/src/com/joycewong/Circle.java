package com.joycewong;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }

    }

    public double getRadius(){
//        System.out.println("The radius from circle is " + this.radius);
        return this.radius;
    }
    public double getArea(){
        double area = Math.PI * this.radius * this.radius;
//        System.out.println("The area from the circle class is " + area);
        return area;
    }
}
