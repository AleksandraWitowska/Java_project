package com.company;

public class Car extends Vehicle
{
    // unique fields for class Car
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    // constructor has all parameters declarated in Car and Vehicle Classes
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual)
    {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    // method assign the current gear
    public void changeGear(int currentGear)
    {
        this.currentGear = currentGear;
        System.out.println("Gear changed to " + this.currentGear + " gear");
    }

    // method assign the current velocity
    public void changeVelocity(int speed, int direction)
    {
        System.out.println("Change velocity: " + speed + " direction " + direction );
        move(speed, direction);
    }

}
