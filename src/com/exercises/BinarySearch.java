package com.exercises;

public class BinarySearch {

    public int search(int[] nums, int target) {

        int start = 0;

        int end = nums.length - 1;

        while (true) {
            int middle = (end - start) / 2 + start;
            if (nums[start] == target) {
                return start;
            }
            if (nums[end] == target) {
                return end;
            }
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle;
            } else {
                start = middle;
            }

            if (start == end || end - start  == 1) {
                if (nums[start] == target) {
                    return start;
                } else {
                    return -1;
                }
            }

        }


    }
}
