package com.company;

public class Outlander extends Car
{
    // unique field for Outlander class
    private int roadServiceMonths;

    // constructor with all parameters
    public Outlander(int roadServiceMonths)
    {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    // method change gear, depend of accelerate
    public void accelerate(int rate)
    {
        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0)
        {
            stop();
            changeGear(1);
        }
        else if(newVelocity > 0 && newVelocity <= 10)
        {
            changeGear(1);
        }
        else if (newVelocity > 10 && newVelocity <=20)
        {
            changeGear(2);
        }
        else if (newVelocity > 20 && newVelocity <= 40)
        {
            changeGear(3);
        }
        else
        {
            changeGear(4);
        }

        if(newVelocity > 0)
        {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
