package com.company;

public class HealthyBurger extends Hamburger
{
    private boolean cucumber;
    private double costCucumber;
    private boolean spinach;
    private double costSpinach;

    public HealthyBurger(String meat, double price)
    {
        super("Healthy","Brown Rye", meat, price);
        this.cucumber = true;
        this.costCucumber = 0.5;
        this.spinach = true;
        this.costSpinach = 1.2;
    }

    // add extra cucumber
    public void addCucumber()
    {
        this.cucumber = true;
        this.costCucumber = 0.5;
    }

    // add extra spinach
    public void addSpinach()
    {
        this.spinach = true;
        this.costSpinach = 0.8;
    }

    @Override
    public double finalPrice()
    {
        double hamburgerPrice = super.finalPrice();
        if(cucumber)
        {
            System.out.println("cucumber cost " + costCucumber + " extra");
            hamburgerPrice += this.costCucumber;
        }
        if (spinach)
        {
            System.out.println("spinach cost " + this.costSpinach + " extra");
            hamburgerPrice += this.costSpinach;
        }
        return hamburgerPrice;
    }
}
