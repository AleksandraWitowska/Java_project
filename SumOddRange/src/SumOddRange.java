public class SumOddRange
{
    //method check if number is odd
    public static boolean isOdd(int number)
    {
        if(number <= 0)
        {
            return false;
        }
        else
        {
            if(number % 2 != 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    //method sum all odd numbers
    public static int sumOdd(int start, int end)
    {
        int sum = 0;
        if(start>0 && end>0 && end>=start)
        {
            for(int i=start; i<=end; i++)
            {
                if(isOdd(i) == true)
                {
                    sum += i;
                }
            }
            return sum;
        }
        else
        {
            return -1;
        }
    }
}