public class PainJob
{
    // method with 4 parameters, return the number of buckets that Bob needs to buy before going work
    // he get extra buckets at home
    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets)
    {
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0))
        {
            System.out.println("invalid value");
            return -1;
        }
        else
        {
            double bucket = Math.ceil(((width*height) - (areaPerBucket*extraBuckets)) / areaPerBucket);
            System.out.println("Bob need " + (int) bucket + " bucket");
            return (int)bucket;


        }
    }

    //method with 3 parameters, return the number of buckets that Bob need to buy before going to work
    // he does not have extra buckets at home
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0))
        {
            System.out.println("invalid value");
            return -1;
        }
        else
        {
            double bucket = Math.ceil((width*height) / areaPerBucket);
            System.out.println("Bob need " + (int) bucket + " bucket");
            return (int)bucket;
        }
    }

    //method with 2 parameters, return the number of buckets that Bob need to buy before going to work
    // He does know the width and heigh of the wall but he knows the area of a wall
    public static int getBucketCount(double area, double areaPerBucket)
    {
        if((area <= 0) || (areaPerBucket <= 0))
        {
            System.out.println("invalid value");
            return -1;
        }
        else
        {
            double bucket = Math.ceil(area/areaPerBucket);
            System.out.println("Bob need " + (int) bucket + " bucket");
            return (int)bucket;
        }
    }
}
