public class NumberOfDaysInMonth
{
    // method check if month is leap
    public static boolean isLeapYear(int year)
    {
        boolean isLeapYear = false;
        if (year >= 1 && year <= 9999)
        {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                isLeapYear = true;
        }
        return isLeapYear;
    }

    //method return the number of days in the month
    public static int getDaysInMonth(int month, int year)
    {
        if (month < 1 || month > 12 || year < 1 || year > 9999)
        {
            return -1;
        }
        int numberOfDays;
        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            numberOfDays = 31;
            break;
            case 2:
                if (isLeapYear(year))
                {
                    numberOfDays = 29;
                }
                else
                {
                    numberOfDays = 28;
                }
                break;
            default:
            case 4: case 6: case 9: case 11:
            numberOfDays = 30;
            break;
        }
        return numberOfDays;
    }
}
