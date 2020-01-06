public class Main
{
    public static void main(String[] args)
    {
        PainJob.getBucketCount(-3.4, 2.1, 1.5, 2);
        PainJob.getBucketCount(3.4, 2.1, 1.5, 2);
        PainJob.getBucketCount(2.75, 3.25, 2.5, 1);

        PainJob.getBucketCount(-3.4, 2.1, 1.5);
        PainJob.getBucketCount(3.4, 2.1, 1.5);
        PainJob.getBucketCount(7.25, 4.3, 2.35);

        PainJob.getBucketCount(3.4,1.5);
        PainJob.getBucketCount(6.26, 2.2);
        PainJob.getBucketCount(3.26, 0.75);
    }

}
