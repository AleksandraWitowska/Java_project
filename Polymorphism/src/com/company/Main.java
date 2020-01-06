package com.company;

class Car
{
    private String name;
    private int cylinder;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinder)
    {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName()
    {
        return name;
    }

    public int getCylinder()
    {
        return cylinder;
    }

    // method return String for Car class
    public String startEngine()
    {
        return "Car -> startEngine";
    }

    // method return String for Car class
    public String accelerate()
    {
        return "Car -> accelerate";
    }

    // method return String for Car class
    public String brake()
    {
        return "Car -> brake";
    }
}

class Impala extends Car
{
    public Impala()
    {
        super("Impala", 8);
    }

    // override method startEngine
    @Override
    public String startEngine()
    {
        return "Impala -> startEngine";
    }

    // override method accelerate
    @Override
    public String accelerate()
    {
        return "Impala -> accelerate";
    }

    // override method brake
    @Override
    public String brake()
    {
        return "Impala -> brake";
    }
}

class Mustang extends Car
{
    public Mustang()
    {
        super("Mustang", 6);
    }

    // less method startEngine for Mustang

    @Override
    public String accelerate()
    {
        return "Mustang -> accelerate";
    }

    @Override
    public String brake()
    {
        return "Mustang -> brake";
    }
}

class Mercedes extends Car
{
    public Mercedes()
    {
        super("Mercedes", 4);
    }

    @Override
    public String startEngine()
    {
        return "Mercedes -> startEngine";
    }

    // less method accelerate for Mercedes

    @Override
    public String brake()
    {
        return "Mercedes -> brake";
    }
}


public class Main
{
    public static void main(String[] args)
    {
	    for(int i=1; i<=10; i++)
        {
            Car car = randomCar();
            System.out.println("Car #" + i + " : " + car.getName());
            System.out.println("startEngine: " + car.startEngine());
            System.out.println("accelerate: " + car.accelerate());
            System.out.println("brake: " + car.brake() + "\n");
        }
    }

    public static Car randomCar()
    {
        // generate random number 1-3
        int randomNumber = (int)(Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber)
        {
            case 1:
                return new Impala();

            case 2:
                return new Mustang();

            case 3:
                return new Mercedes();
        }
        return null;
    }

}
