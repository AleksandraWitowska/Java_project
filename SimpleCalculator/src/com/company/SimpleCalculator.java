package com.company;

public class SimpleCalculator
{
    // fields
    private double firstNumber;
    private double secondNumber;

    // set the value of the firstNumber field
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber = firstNumber;
    }

    // set the value of the secondNumber field
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber = secondNumber;
    }

    // return the value of firstNumber field
    public double getFirstNumber()
    {
        return this.firstNumber;
    }

    // return the value of secondNumber field
    public double getSecondNumber()
    {
        return this.secondNumber;
    }

    // return the result of adding the field values
    public double getAdditionResult()
    {
        double add = this.firstNumber + this.secondNumber;
        return add;
    }

    // return the result of subtracting the field values
    public double getSubtractionResult()
    {
        double subtract = this.firstNumber - this.secondNumber;
        return subtract;
    }

    // return the result of multiplying the field values
    public double getMultiplicationResult()
    {
        double multiply = this.firstNumber * this.secondNumber;
        return multiply;
    }

    // return the result of dividing the field values
    public double getDivisionResult()
    {
        if(this.secondNumber == 0)
        {
            return 0;
        }
        double divide = this.firstNumber / this.secondNumber;
        return divide;
    }
}
