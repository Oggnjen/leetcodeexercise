package com.exercises;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        int[] arr = {805306368,805306368,805306368};
        int h = 1000000000;
        System.out.println(kokoEatingBananas.minEatingSpeed(arr, h));
    }


}
