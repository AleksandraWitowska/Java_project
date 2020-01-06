package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // scanner value from keyboard
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while(true)
        {
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt)
            {
                int number = scanner.nextInt();

                if(first)
                {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max)
                {
                    max = number;
                }

                if(number < min)
                {
                    min = number;
                }

            }
            else
            {
                System.out.println("Invalid number");
                break;
            }

            scanner.nextLine();
        }
        //return min and max value
        System.out.println("Max number is: " + max + " and min number is: " + min);
        scanner.close();

    }
}
