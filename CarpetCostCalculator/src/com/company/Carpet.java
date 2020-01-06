package com.company;

public class Carpet
{
    // field
    private double cost;

    // constructor with parameter cost
    public Carpet(double cost)
    {
        if(cost < 0)
        {
            this.cost = 0;
        }
        else
        {
            this.cost = cost;
        }
    }

    // method return value of cost field
    public double getCost()
    {
        return this.cost;
    }
}
