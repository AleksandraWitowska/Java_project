package com.company;

public class Cuboid extends Rectangle
{
    // field
    private double height;

    // constructors with all parameters
    public Cuboid(double width, double length, double height)
    {
        super(width, length);

        if(height < 0)
        {
            this.height = 0;
        }
        else
        {
            this.height = height;
        }
    }

    // methods return the value of height
    public double getHeight()
    {
        return height;
    }

    // method return the calculated volume
    public double getVolume()
    {
        return getArea() * this.height;
    }
}
