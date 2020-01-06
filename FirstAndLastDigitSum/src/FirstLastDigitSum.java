public class FirstLastDigitSum
{
    // method needs to find the first and the last digit of number
    public static int sumFirstAndLastDigit(int number)

    {
        int num, lastDigit, reverse = 0;
        int sumofdigits = 0;

        if(number < 0)
        {
            return -1;
        }

        else
        {
            num = number;
            while(number > 0)
            {
                lastDigit = number % 10;
                reverse = (reverse*10) + lastDigit;
                number = number / 10;
            }

            num = num % 10;
            reverse = reverse % 10;
            return (sumofdigits = num + reverse);

        }
    }
}