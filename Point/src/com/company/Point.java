package com.company;

public class Point
{
    private int x;
    private int y;

    // first constructor does not have any parameters
    public Point()
    {

    }

    // second constructor has parameter x, y
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // return the value of x field
    public int getX()
    {
        return x;
    }

    // set the value of the x field
    public void setX(int x)
    {
        this.x = x;
    }

    //return the y field
    public int getY()
    {
        return y;
    }

    //set the value of the y field
    public void setY(int y)
    {
        this.y = y;
    }

    // distance without any parameters, return distance between Point and (0,0)
    public double distance()
    {
       double distance = Math.sqrt(x * x + y * y);
       return distance;
    }

    // distance with two parameter x,y, return distance between Point and (x,y)
    public double distance(int x, int y)
    {
        double distance = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        return distance;
    }

    //distance with parameter another of Point, return distance between Point and another Point
    public double distance(Point point)
    {
        double distance = Math.sqrt((point.getX() - this.x) * (point.getX() - this.x) + (point.getY() - this.y) * (point.getY() - this.y));
        return distance;
    }
}
