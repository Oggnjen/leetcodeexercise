package com.exercises;

import java.util.Stack;

public class LargestRectangleInHistogram {

    class PositionAndHeight {
        int position;
        int height;

        public PositionAndHeight(int position, int height) {
            this.position = position;
            this.height = height;
        }
    }

    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<PositionAndHeight> positionAndHeights = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            if (i == 0) {
                positionAndHeights.push(new PositionAndHeight(i, heights[i]));
                continue;
            }
            if (heights[i] < positionAndHeights.peek().height) {
                PositionAndHeight lastElement = positionAndHeights.peek();
                while (!positionAndHeights.isEmpty() && heights[i] < positionAndHeights.peek().height) {
                    int area = (i - positionAndHeights.peek().position) * positionAndHeights.peek().height;
                    if (area > max) {
                        max = area;
                    }
                    lastElement = positionAndHeights.pop();
                }
                positionAndHeights.push(new PositionAndHeight(lastElement.position, heights[i]));
            } else {
                positionAndHeights.push(new PositionAndHeight(i, heights[i]));
            }
        }

        while(!positionAndHeights.isEmpty()) {
            int area = (heights.length - positionAndHeights.peek().position) * positionAndHeights.pop().height;
            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}
