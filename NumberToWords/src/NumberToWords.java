public class NumberToWords
{
    // method should print out the passed number using words for the digits
    public static void numberToWords(int number)
    {
        if(number < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            System.out.println("Number to words in " + number + " is:");
            int cipher = 0;
            int numberReverse = reverse(number);
            for(int i = 1; i <= getDigitCount(number); i++)
            {
                cipher = numberReverse % 10;
                switch(cipher)
                {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                numberReverse /= 10;
            }
        }
    }

    // method should return the count of the digits in number
    public static int getDigitCount(int number)
    {
        if (number < 0 )
        {
            return -1;
        }
        else if(number == 0)
        {
            return 1;
        }
        else
        {
            int count = 0;
            while(number != 0)
            {
                number /= 10;
                count ++;
            }
            return count;
        }
    }

    // method should return the reversed number
    public static int reverse(int reverseNumber)
    {
        int result = 0;
        while(reverseNumber != 0)
        {
            result = (result * 10) + (reverseNumber % 10);
            reverseNumber /= 10;
        }
        return result;
    }
}