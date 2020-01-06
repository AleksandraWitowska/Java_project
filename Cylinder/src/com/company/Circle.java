package com.company;

public class Circle
{
    // field
    private double radius;

    // constructor with parameter radius
    public Circle(double radius)
    {
        if(radius < 0)
        {
            this.radius = 0;
        }
        else
        {
            this.radius = radius;
        }
    }

    // method return the value of radius
    public double getRadius()
    {
        return radius;
    }

    // method return the calculated ares
    public double getArea()
    {
        return Math.pow(radius, 2) * Math.PI;
    }
}
