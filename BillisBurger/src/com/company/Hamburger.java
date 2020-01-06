package com.company;

public class Hamburger
{
    // fields
    private String rollType;
    private String meat;
    private String name;
    private double price;
    private boolean lettuce;
    private double costLettuce;
    private boolean tomato;
    private double costTomato;
    private boolean onion;
    private double costOnion;
    private boolean cheese;
    private double costCheese;

    public Hamburger(String name, String rollType, String meat, double price)
    {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    // add extra lettuce
    public void addLettuce()
    {
        this.lettuce = true;
        this.costLettuce = 0.5;
    }

    // add extra tomato
    public void addTomato()
    {
        this.tomato = true;
        this.costTomato = 0.6;
    }

    // add extra onion
    public void addOnion()
    {
        this.onion = true;
        this.costOnion = 0.3;
    }

    // add extra cheese
    public void addCheese()
    {
        this.cheese = true;
        this.costCheese = 1.2;
    }

    // calculate the final price
    public double finalPrice()
    {
        double hamburgerPrice = this.price;
        if(lettuce)
        {
            System.out.println("lettuce cost " + costLettuce + " extra");
            hamburgerPrice += this.costLettuce;
        }
        if (tomato)
        {
            System.out.println("tomato cost " + this.costTomato + " extra");
            hamburgerPrice += this.costTomato;
        }
        if (onion)
        {
            System.out.println("onion cost " + this.costOnion + " extra");
            hamburgerPrice += this.costOnion;
        }
        if (cheese)
        {
            System.out.println("cheese cost " + this.costCheese + " extra");
            hamburgerPrice += this.costCheese;
        }


        return hamburgerPrice;
    }

    public String getRollType()
    {
        return rollType;
    }

    public String getMeat()
    {
        return meat;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}
