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
        double a;
        a = Math.pow(radius,2)*Math.PI;
        return a;
    }

    public double circumference(){
        double c;
        c = radius*2*Math.PI;
        return c;
    }

    /*public double getA()
    {
        return area;
    }

    public double getC()
    {
        return circumference();
    }*/

    public static void main(String[] args){
        Circle r1 = new Circle (8);
        Circle r2 = new Circle();
        double a1 = r1.area();
        //double a2 = r2.area();
        //double c1 = r1.circumference();
        System.out.println("Area = " + a1);
        System.out.println("Area = " + r2.area());
        System.out.println("Circumference = " + r1.circumference());
    }
}
