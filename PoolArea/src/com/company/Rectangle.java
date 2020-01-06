package com.company;

public class Rectangle
{
    // fields
    private double width;
    private double length;

    // constructor with parameters width and length
    public Rectangle(double width, double length)
    {
        if(width < 0)
        {
            this.width = 0;
        }
        else
        {
            this.width = width;
        }
        if(length < 0)
        {
            this.length = 0;
        }
        else
        {
            this.length = length;
        }
    }

    // method return the value of width
    public double getWidth()
    {
        return width;
    }

    // method return the value of length
    public double getLength()
    {
        return length;
    }

    // method return the value of calculated area
    public double getArea()
    {
        return this.length * this.width;
    }
}
