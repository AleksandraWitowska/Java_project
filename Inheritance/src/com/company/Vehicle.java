package com.company;

public class Vehicle
{
    // fields applies in all classes
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    // constructor has parameters name and size
    public Vehicle(String name, String size)
    {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    // method return current direction
    public void steer(int direction)
    {
        this.currentDirection += direction;
        System.out.println("Steering at " + currentDirection + "\n");
    }

    // method return current velocity and direction
    public void move(int velocity, int direction)
    {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Moving at " + currentVelocity + " in direction " + currentDirection + "\n");
    }

    // method return the value of name
    public String getName()
    {
        return name;
    }

    // method return the value of size
    public String getSize()
    {
        return size;
    }

    // method return velocity
    public int getCurrentVelocity()
    {
        return currentVelocity;
    }

    // method return direction
    public int getCurrentDirection()
    {
        return currentDirection;
    }

    // method assigned value 0 to velocity -> stop the car
    public void stop()
    {
        this.currentVelocity = 0;
    }
}
