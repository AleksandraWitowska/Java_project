package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Hamburger hamburger1 = new Hamburger("classic", "classic bread", "chicken", 25.50);
        System.out.println("Your hamburger name: " + hamburger1.getName() + ", roll type: " + hamburger1.getRollType() + " with " + hamburger1.getMeat() + " cost " + hamburger1.getPrice());
        hamburger1.addCheese();
	    hamburger1.addOnion();
	    hamburger1.finalPrice();
        System.out.println("Total price: " + hamburger1.finalPrice() + "\n" );

	    HealthyBurger healthyBurger = new HealthyBurger("beckon", 28.00);
        System.out.println("Your hamburger name: " + healthyBurger.getName() + ", roll type: " + healthyBurger.getRollType() + " with " + healthyBurger.getMeat() + " cost " + healthyBurger.getPrice());
        healthyBurger.addCucumber();
	    healthyBurger.addSpinach();
	    healthyBurger.finalPrice();
        System.out.println("Total price: " + healthyBurger.finalPrice() + "\n" );

        DeluxBurger deluxBurger = new DeluxBurger("white", "ham", 14.50);
        System.out.println("Your hamburger name: " + deluxBurger.getName() + ", roll type: " + deluxBurger.getRollType() + " with " + deluxBurger.getMeat() + " cost " + deluxBurger.getPrice());

        deluxBurger.addCheese();
        deluxBurger.addDrink();
    }
}
