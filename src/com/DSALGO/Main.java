package com.DSALGO;
import java.util.*;

public class Main {
    public boolean twoSum(int a[], int target) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int currSum = a[i] + a[j];
            if(currSum == target) {
                System.out.println(a[i] + " " + a[j]);
                return true;
            }

            if(currSum > target) {
                j--;
            }
            if(currSum < target) {
                i++;
            }
        }
        return false;
    }

    public boolean twoSum1(int a[], int target) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i+1; j < a.length; j++) {
                if(a[i] + a[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
	// write your code here
        int a[] = {5,3,7,9,6,1,2};
        Arrays.sort(a);
        Main m = new Main();
        boolean res = m.twoSum1(a,20);
        if(res) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }
}
