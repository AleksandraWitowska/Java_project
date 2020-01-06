package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    Printer printer = new Printer(30, true);
        System.out.println("Initial page count = " + printer.getNumberOfPages());
        int pagesToPrint = printer.pageToPrint(6);
        System.out.println("Pages printed was " + pagesToPrint + " new total print count for printer = " + printer.getNumberOfPages() + "\n");

        printer.addToner(60);
        System.out.println("Toner level is " + printer.getTonerLevel());
        System.out.println("Initial page count = " + printer.getNumberOfPages());
        int toPrint = printer.pageToPrint(6);
        System.out.println("Pages printed was " + toPrint + " new total print count for printer = " + printer.getNumberOfPages() + "\n");

        printer.addToner(8);
        System.out.println("Toner level is " + printer.getTonerLevel());
        System.out.println("Initial page count = " + printer.getNumberOfPages());
        int toPrint1 = printer.pageToPrint(13);
        System.out.println("Pages printed was " + toPrint1 + " new total print count for printer = " + printer.getNumberOfPages() + "\n");
    }
}
