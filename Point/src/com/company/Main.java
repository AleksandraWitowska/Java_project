package com.company;

public class Main {

    public static void main(String[] args)
    {
        Point point1 = new Point(6, 5);
        Point point2 = new Point(3, 1);
        System.out.println("Point 1 is (" + point1.getX() + "," + point1.getY() + ")");
        System.out.println("distance point1 (0,0) = " + point1.distance());
        System.out.println("Point 2 is (" + point2.getX() + "," + point2.getY() + ")");
        System.out.println("distance point1 (point2) = " + point1.distance(point2));
        System.out.println("distance point1 (2,2) = " + point1.distance(2, 2));

        Point point3 = new Point();
        System.out.println("Point 3 is (" + point3.getX() + "," + point3.getY() + ")");
        System.out.println("distance point3() = " + point3.distance());

    }
}
