package com.exercises;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater.trap(arr));
    }


}
