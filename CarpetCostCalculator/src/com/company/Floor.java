package com.company;

public class Floor
{
    // fields
    private double width;
    private double length;

    // constructor with parameters width and length
    public Floor(double width, double length)
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

    // method return the calculated area
    public double getArea()
    {
        return this.length * this.width;
    }
}

