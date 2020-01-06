package com.company;

public class Printer
{
    private int tonerLevel;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter)
    {
        if(tonerLevel >= 0 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
        }
        else
        {
            this.tonerLevel = -1;
        }

        this.duplexPrinter = duplexPrinter;
        this.numberOfPages = 0;
    }

    // method add toner
    public int addToner(int tonerAmount)
    {
        if (tonerAmount > 0 && tonerAmount <= 100)
        {
            if (this.tonerLevel + tonerAmount > 100)
            {
                return -1;
            }

            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else
        {
            return -1;
        }
    }

    // method check how many pages we will print
    public int pageToPrint(int pages)
    {
        int pagesToPrint = pages;
        if (this.duplexPrinter)
        {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Duplex mode is on");
        }
        this.numberOfPages += pagesToPrint;
        return pagesToPrint;
    }

    // return number of pages
    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public int getTonerLevel()
    {
        return tonerLevel;
    }
}
