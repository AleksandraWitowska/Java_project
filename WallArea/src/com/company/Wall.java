package com.company;

public class Wall
{
    private double width;
    private double height;

    // first constructor does not have any parameters
    public Wall ()
    {
        this(0.00, 0.00);
    }

    // second constructor has parameters width and height
    public Wall(double width, double height)
    {
        this.width = width;
        this.height = height;

        if(width < 0)
        {
            this.width = 0;
        }

        if(height < 0)
        {
            this.height = 0;
        }
    }

    // method return the value of width field
    public double getWidth()
    {
        return this.width;
    }

    // set the value of the width field
    public void setWidth(double width)
    {
        if(width < 0)
        {
            this.width = 0;
        }
        else
        {
            this.width = width;
        }

    }

    // method return the value of the width field
    public double getHeight()
    {
        return this.height;
    }

    // set the value of height field
    public void setHeight(double height)
    {
        if(height < 0)
        {
            this.height = 0;
        }
        else
        {
            this.height = height;
        }
    }

    // return the area of the wall
    public double getArea()
    {
        double area = this.height * this.width;
        return area;
    }
}
