package com.DSALGO;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public boolean twoSumOfNumber(int arr[], int sum) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if(arr[i] + arr[j] == sum) return true;
            if(arr[i] + arr[j] > sum) j--;
            if(arr[i] + arr[j] < sum) i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {7,11,-1,23,50,-9};
        int sum1 = 6;
        int sum2 = 8;
        int sum3 = 34;
        Arrays.sort(a);
        TwoSum tw = new TwoSum();
        System.out.println(tw.twoSumOfNumber(a,sum1));
        System.out.println(tw.twoSumOfNumber(a,sum2));
        System.out.println(tw.twoSumOfNumber(a,sum3));


    }
}
