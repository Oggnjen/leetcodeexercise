package com.exercises;

import java.util.Stack;

public class TrappingRainWater {
    public int trap(int[] height) {
        int sum = 0;
//        Stack<Integer> floors = new Stack<>();
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int maxLeft = height[0];
        int maxRight = height[height.length - 1];

        // left is true
        // right is false
        boolean sideMoved = true;

        while (leftPointer != rightPointer) {
            if (leftPointer == 0 && rightPointer == height.length - 1) {
                if (chooseSmaller(maxLeft, maxRight)) {
                    rightPointer--;
                    sideMoved = true;
                } else {
                    leftPointer++;
                    sideMoved = false;
                }
                continue;
            }
            if (!sideMoved) {
                int h = height[leftPointer];
                int s = maxLeft - h;
                if (s > 0 ) {
                    sum += s;
                }
            } else {
                int h = height[rightPointer];
                int s = maxRight - h;
                if (s > 0 ) {
                    sum += s;
                }
            }
            if (height[leftPointer] > maxLeft) {
                maxLeft = height[leftPointer];
            }

            if (height[rightPointer] > maxRight) {
                maxRight = height[rightPointer];
            }

            if (chooseSmaller(maxLeft, maxRight)) {
                rightPointer--;
                sideMoved = true;
            } else {
                leftPointer++;
                sideMoved = false;
            }

        }


        return sum;
    }

    private boolean chooseSmaller (int left, int right) {
        return left > right;
    }
}
