package com.company;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder (double h, double r){
        double radius;
        radius = r;
        height = h;
        Circle base = new Circle(radius);
    }

    public double Volume(){
        double vol;
        vol = base*height;
        //vol = getA()*height;
        return vol;
    }

    public double SurfaceArea(){
        double sa;
        sa = base/radius*2*height+base*2;
        //sa = getC()*height+getA()*2;                            //circumference*height+area*2
        return sa;
    }

    public static void main(String[] args){
        Cylinder cyl = new Cylinder(5,2);
        //System.out.println();
        double vol = cyl.vol();
        System.out.println("radius = 5 height = 2 volume = " + vol);
        //double sa = cyl.sa();
        //System.out.println("surface area = " + sa);

        Cylinder cyl2 = new Cylinder(8,6);
        vol = cyl2.vol();
        System.out.println("radius = 8 height = 6 volume = " + vol);
        //sa = cyl2.sa();
        //System.out.println("surface are = " + sa);

    }

}
