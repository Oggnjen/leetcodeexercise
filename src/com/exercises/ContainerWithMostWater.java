package com.exercises;

public class ContainerWithMostWater {

    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int smaller = Math.min(heights[right], heights[left]);
            int canBeFilled = Math.abs(right - left) * smaller;
            if (canBeFilled > max) {
                max = canBeFilled;
            }
            if (smaller == heights[right]) right--;
            else left++;
        }

        return max;
    }
}
