package com.company;

public class Cylinder extends Circle
{
    // field
    private double height;

    // constructor with parameters radius and height

    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }

    // method return the value of height
    public double getHeight()
    {
        if(height < 0)
        {
            this.height = 0;
        }
        else
        {
            this.height = height;
        }
        return this.height;
    }

    // method return the calculated volume
    public double getVolume()
    {
        return getArea() * this.height;
    }
}
