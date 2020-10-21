package com.company;

public class Circle {
    private double radius;

    public Circle(){
        radius = 5;
    }

    public Circle (double r){
        radius = r;
    }

    public double area(){
        double a = Math.pow(radius,2)*Math.PI;
        return a;
    }

    public double circumference(){
        double c = radius*2*Math.PI;
        return c;
    }

    public static void main(String[] args){
        Circle r1 = new Circle (8);
        Circle r2 = new Circle();
        double a1 = r1.area();
        //double a2 = r2.area();
        //double c1 = r1.circumference();
        System.out.println("Area = " + a1 + " when radius is " + r1.radius);
        System.out.println("Area = " + r2.area() + " when radius is set at default: " + r2.radius);
        System.out.println("Circumference = " + r1.circumference() + " when radius is " + r1.radius);
    }
}
