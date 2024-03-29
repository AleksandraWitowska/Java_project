package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Carpet cost " + carpet.getCost() + " per square meter");
        System.out.println("Area of floor = " + floor.getArea());
        System.out.println("total cost = " + calculator.getTotalCost() + "\n");

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Carpet cost " + carpet.getCost() + " per square meter");
        System.out.println("Area of floor = " + floor.getArea());
        System.out.println("total cost = " + calculator.getTotalCost() + "\n");

        carpet = new Carpet(0);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Carpet cost " + carpet.getCost() + " per square meter");
        System.out.println("Area of floor = " + floor.getArea());
        System.out.println("total cost = " + calculator.getTotalCost() + "\n");

        carpet = new Carpet(1.5);
        floor = new Floor(-1, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Carpet cost " + carpet.getCost() + " per square meter");
        System.out.println("Area of floor = " + floor.getArea());
        System.out.println("total cost = " + calculator.getTotalCost() + "\n");
    }
}
