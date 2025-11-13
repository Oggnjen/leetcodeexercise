package com.exercises;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {

        int max = Arrays.stream(piles).max().orElse(1);

        int start = 1;

        int end = max;

        long min = isRateOk(piles, max);


        while (start <= end) {
           int middle = (start + end) / 2;

           long time = isRateOk(piles, middle);

           if (time <= h) {
               min = middle;
               end = middle - 1;
           } else {
               start = middle + 1;
           }

        }

        return ((int) min);
    }

    private long isRateOk(int[] piles, int rate) {
        long hoursSum = 0;
        for (int i = 0; i <= piles.length - 1; i++) {
            int hoursToEat = ceilDiv(piles[i] , rate);
            hoursSum += hoursToEat;
        }

        return hoursSum;
    }

    private int ceilDiv(int x, int y) {
        double res = (double) x / y;
        int resNum = x / y;
        if (((double) resNum) == res) {
            return resNum;
        } else {
            return ++resNum;
        }
    }
}
