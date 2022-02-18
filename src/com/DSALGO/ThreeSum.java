package com.DSALGO;

import java.util.*;

public class ThreeSum {

    public boolean threeSum(int a[], int sum){
        for(int i = 0; i < a.length-2; i++) {
            for(int j = i+1; j < a.length-1; j++) {
                for(int k = j+1; k < a.length; k++) {
                    if(a[i] + a[j] + a[k] == sum) {
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean threeSumHash(int a[], int sum) {
        for(int i = 0; i < a.length - 2; i++) {
            int curr = sum - a[i];
            Set<Integer> s = new HashSet<>();
            for(int j = i + 1; j < a.length; j++) {
                if(s.contains(curr - a[j])) {
                    return true;
                }
                s.add(a[j]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {4,8,10,11,15,17,20,21,23};
        int sum = 85;
        Arrays.sort(arr);
        ThreeSum ts = new ThreeSum();
        boolean res = ts.threeSumHash(arr,sum);
        System.out.println(res);
    }
}
