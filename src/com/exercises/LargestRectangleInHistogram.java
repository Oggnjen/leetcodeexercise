package com.exercises;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int[] leftHighest = new int[heights.length];
        int[] rightHighest = new int[heights.length];

        leftHighest[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i-1] > heights[i]) {
                leftHighest[i] = heights[i];
            } else {
                leftHighest[i] = leftHighest[i-1];
            }
        }

        for (int i = heights.length - 1; i >= 0; i--) {
            if (i == heights.length - 1) {
                rightHighest[i] = heights[i];
                continue;
            }
            if (heights[i+1] > heights[i]) {
                rightHighest[i] = heights[i];
            } else {
                rightHighest[i] = rightHighest[i+1];
            }
        }

        return max;
    }
}
