package com.company;

public class Calculator
{
    // fields
    private Floor floor;
    private Carpet carpet;

    // constructor with parameters floor of type Floor and carpet of type Carpet
    public Calculator(Floor floor, Carpet carpet)
    {
        this.floor = floor;
        this.carpet = carpet;
    }

    // method return the calculated total cost to cover the floor with a carpet
    public double getTotalCost()
    {
        return floor.getArea() * carpet.getCost();
    }
}
