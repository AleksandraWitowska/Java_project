package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // entry numbers from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry numbers: ");

        int sum = 0;
        int number = 0;

        while(true)
        {
            boolean isAsInt = scanner.hasNextInt();
            if(isAsInt)
            {
                int value = scanner.nextInt();

                number ++;
                sum += value;

            }
            else
            {
                System.out.println("Invalid value");
                break;
            }

            scanner.nextLine();

        }
        scanner.close();

        // return value of sum and avg
        long avg = Math.round((double)sum / (double)number);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
