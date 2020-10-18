package com.company;

public class Line {
    private Point end1;
    private Point end2;
    private Point mid;

    public Line(double x1, double y1, double x2, double y2)
    {
        end1 = new Point(x1,y1);
        end2 = new Point(x2,y2);
    }

    public Line()		// default constructor
    {
        end1 = new Point();
        end2 = new Point();
    }

    public double distance()
    {
        //You may find Math.pow(base, power) and Math.sqrt(num) useful
        double d;
        d = Math.sqrt((Math.pow(end2.getX()-end1.getX(), 2))+(Math.pow(end2.getY()-end1.getY(), 2)));
        return d;
    }

    public Point midpoint()
    {
        double x3;
        double y3;
        x3 = (end1.getX()+end2.getX())/2;
        y3 = (end1.getY()+end2.getY())/2;
        Point mid = new Point(x3, y3);
        return mid;
    }

    public boolean sameLength(Line otherLine)
    {
        double d1 = this.distance();
        double d2 = otherLine.distance();
        return Math.abs(d1-d2)<=.0001;
    }

    public double slope()
    {
        double m;
        m = (end2.getY()-end1.getY())/(end2.getX()-end1.getX());
        return m;

    }

    public String toString()
    {
        String s = "Line with endpoints " + end1 + " and " + end2;
        return s;
    }

    public boolean parallel(Line otherLine)
    {
        double m1 = this.slope();
        double m2 = otherLine.slope();
        //return m1==m2;
        //because of round off error, it is not recommended that you compare
        //two floats for equality, but that their difference is small
        return Math.abs(m1-m2)<=.0001;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Line l1 = new Line(-1,-3, 2,1);             //Defines line 1
        double m = l1.slope();
        System.out.println(l1);                                     //Points of line 1
        System.out.println("Slope = " + m);                         //Slope of line 1

        Line l2 = new Line(0,0,3,4);                //Defines line 1
        System.out.println(l2);                                     //Points of line 2
        System.out.println("Slope = " + l2.slope());                //Slope of line 2
        System.out.println("Parallel? " + l1.parallel(l2));         //Determines if they are parallel

        double d = l1.distance();
        Point mid = l1.midpoint();
        System.out.println(l1);                                     //Points of line 1
        System.out.println("Distance = " + d);                      //Distance of line 1
        System.out.println("Midpoint = " + "(" + mid.getX() + ", " + mid.getY() + ")"); //Midpoint of line 1

        System.out.println(l2);                                        //Points of line 2
        System.out.println("Distance = " + l2.distance());              //Distance of line 1
        System.out.println("Midpoint = " + l2.midpoint());              //Midpoint of line 2
        System.out.println("Same length? " + l1.sameLength(l2));        //Are they the same length

    }

}