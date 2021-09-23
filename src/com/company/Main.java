package com.company;

public class Main {

    public static void main(String[] args) {
	getBucketCount(0,0,0,0);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            System.out.println("Invalid measurements");
            return -1;
        }
        return 1;
    }
}
