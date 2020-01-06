public class LargestPrime
{
    //method should calculate the largest prime factors of a given number and return it
    public static int getLargestPrime(int number)
    {
        if(number <= 1)
        {
            return -1;
        }
        boolean isPrime;
        int temp;

        for(int i=number; i>1; i--)
        {
            if(number%i == 0)
            {
                isPrime = true;

                for(int j=2; j<=(i/2); j++)
                {
                    temp = i % j;
                    if(temp == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}