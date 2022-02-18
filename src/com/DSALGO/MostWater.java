package com.DSALGO;

public class MostWater {
    int mostWater(int h[]) {
        int i = 0, water = 0;
        int j = h.length - 1;
        while (i < j) {
            int height = Math.min(h[i],h[j]);
            int width = Math.abs((i-j));
            water = Math.max((height*width), water);
            if(h[i] < h[j]) {
                i++;
            }else {
                j--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int h[] = {1,8,7,4,9,2,3};
        int res;
        MostWater m = new MostWater();
        res = m.mostWater(h);
        System.out.println(res);
    }
}
