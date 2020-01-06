package com.company;

public class ComplexNumber
{
    // fields
    private double real;
    private double imaginary;

    // constructor has parameters real and imaginary
    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    // method return the value of rear field
    public double getReal()
    {
        return real;
    }

    // method return the value of imaginary field
    public double getImaginary()
    {
        return imaginary;
    }

    // method with two parameters real and double -> add parameters to fields
    public void add(double real, double imaginary)
    {
        this.real += real;
        this.imaginary += imaginary;
    }

    // method with one parameters of type ComplexNumber -> add ComplexNumber to the corresponding instance variables
    public void add(ComplexNumber complexNumber)
    {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    // method with two parameters real and imaginary -> subtract parameters from fields
    public void subtract(double real, double imaginary)
    {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // method with one parameters of type ComplexNumber -> subtract the other parameters from this complex number
    public void subtract(ComplexNumber complexNumber)
    {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }

}
