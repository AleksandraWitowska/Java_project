package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea() + "\n");

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume() + "\n");

        Cuboid cuboid1 = new Cuboid(0,10,5);
        System.out.println("cuboid1.width= " + cuboid1.getWidth());
        System.out.println("cuboid1.length= " + cuboid1.getLength());
        System.out.println("cuboid1.area= " + cuboid1.getArea());
        System.out.println("cuboid1.height= " + cuboid1.getHeight());
        System.out.println("cuboid1.volume= " + cuboid1.getVolume());
    }
}
