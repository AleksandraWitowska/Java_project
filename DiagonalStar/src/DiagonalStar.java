public class DiagonalStar
{
    //method should print diagonals to generate a rectangular pattern composed of stars *
    public static void printSquareStar(int number)
    {
        if (number < 5)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            for(int i = 1; i <= number; i++)
            {
                for(int j = 1; j <= number; j++)
                {
                    if (i == 1 || i == number || j == 1 || j == number || i == j || j == number - i + 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println("\n");
        }
    }

}