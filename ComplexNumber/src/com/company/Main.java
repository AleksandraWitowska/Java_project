package com.company;

public class Main {

    public static void main(String[] args)
    {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("number is: " + one.getReal() + " - " + one.getImaginary() + "i");
        System.out.println("real= " + one.getReal());
        System.out.println("imaginary= " + one.getImaginary() + "\n");

        one.subtract(number);
        System.out.println("number is: " + one.getReal() + " - " + one.getImaginary() + "i");
        System.out.println("real= " + one.getReal());
        System.out.println("imaginary= " + one.getImaginary() + "\n");

        number.subtract(one);
        System.out.println("number is: " + number.getReal() + " - " + number.getImaginary() + "i");
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
