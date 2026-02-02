package com.exercises;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        MinimumInRotatedSortedArray minimumInRotatedSortedArray = new MinimumInRotatedSortedArray();
        int[] nums1 = {3,4,5,6,1,2};
        int[] nums2 = {5,1,2,3,4};
        System.out.println(minimumInRotatedSortedArray.findMin(nums2));
    }


}
