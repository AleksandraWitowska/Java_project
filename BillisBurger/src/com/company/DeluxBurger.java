package com.company;

public class DeluxBurger extends Hamburger
{
    private boolean drink;
    private double costDrink;
    private boolean chips;
    private double costChips;

    public DeluxBurger(String rollType, String meat, double price)
    {
        super("Delux", rollType, meat, price);
    }

    // add extra drink
    public void addDrink()
    {
        this.drink = true;
        this.costDrink = 1.5;
        System.out.println("extra drink cost " + this.costDrink);
    }

    // add extra chips
    public void addChips()
    {
        this.chips = true;
        this.costChips = 2;
        System.out.println("Extra chips cost " + this.costChips);
    }

    @Override
    public void addLettuce()
    {
        System.out.println("cannot add");
    }

    @Override
    public void addTomato()
    {
        System.out.println("Cannot add");
    }

    @Override
    public void addOnion()
    {
        System.out.println("Cannot add");
    }

    @Override
    public void addCheese()
    {
        System.out.println("Cannot add");
    }

}
