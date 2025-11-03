package com.exercises;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] arr = {1,7,2,5,4,7,3,6};
        System.out.println(containerWithMostWater.maxArea(arr));
    }


}
