package com.company;

public class Main {

    public static void main(String[] args) {
	    getBucketCount(0,0,0,0);
        getBucketCount(1,2,3,0);
        getBucketCount(1,2,3,-1);
        getBucketCount(-3.4,2.1,1.5,2);
        getBucketCount(3.4,2.1,1.5,2);
        getBucketCount(2.75,3.25,2.5,1);
        getBucketCount(-3.4,2.1,1.5);
        getBucketCount(3.4,2.1,1.5);
        getBucketCount(7.25,4.3,2.35);
        getBucketCount(3.4,1.5);
        getBucketCount(6.26,2.2);
        getBucketCount(3.26,0.75);
        getBucketCount(-1, 5.5);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        double numberOfBucketsToBuy = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            System.out.println("Invalid measurements");
            return -1;
        } else {
            numberOfBucketsToBuy = (((width * height) / areaPerBucket) - (double) extraBuckets);
            int bucketsToBuy = (int) Math.ceil(numberOfBucketsToBuy);
            System.out.println(bucketsToBuy);
            return bucketsToBuy;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double numberOfBucketsToBuy = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            System.out.println("Invalid measurements");
            return -1;
        } else {
            numberOfBucketsToBuy = ((width * height) / areaPerBucket);
            int bucketsToBuy = (int) Math.ceil(numberOfBucketsToBuy);
            System.out.println(bucketsToBuy);
            return bucketsToBuy;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        double numberOfBucketsToBuy = 0;

        if (area <= 0 || areaPerBucket <= 0) {
            System.out.println("Invalid measurements");
            return -1;
        } else {
            numberOfBucketsToBuy = (area / areaPerBucket);
            int bucketsToBuy = (int) Math.ceil(numberOfBucketsToBuy);
            System.out.println(bucketsToBuy);
            return bucketsToBuy;
        }
    }
}
