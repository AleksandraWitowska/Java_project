public class PerfectNumber
{
    //method check if number is perfect
    //a perfect number is a positive integer which is equal to sum of its proper positive divisors
    //proper positive divisors are positive integers that fully divide the perfect number without leaving a
    //remainer and exclude the perfect number itself
    public static boolean isPerfectNumber(int number)
    {
        if(number < 1)
        {
            return false;
        }
        int sum = 0;
        for(int i=1; i<number; i++)
        {
            if(number % i == 0)
            {
                sum += i;
            }
        }
        if(sum==number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}