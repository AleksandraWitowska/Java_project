package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        // scanner 10 value from keyboard
        while (i < 10)
        {
            int counter = i + 1;
            System.out.println("Entry value #" + counter);

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt)
            {
                int value = scanner.nextInt();
                scanner.nextLine();
                i++;

                System.out.println("Value #" + i + " is " + value);
                sum += value;
                continue;
            }

            else
            {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }
        // return sum of all 10 values
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
