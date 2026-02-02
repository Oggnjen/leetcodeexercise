package com.exercises;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int[] nums1 = {4,5,6,7,8,1,2,3};
        int target = 8;
        System.out.println(searchInRotatedSortedArray.search(nums1, target));
    }


}
