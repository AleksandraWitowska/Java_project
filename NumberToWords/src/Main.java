public class Main
{
    public static void main(String[] args)
    {
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println("******");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(2121));
        System.out.println(NumberToWords.reverse(4321));
        System.out.println(NumberToWords.reverse(100));
        System.out.println("********");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);

    }
}