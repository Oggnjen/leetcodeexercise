package com.exercises;

public class MinimumInRotatedSortedArray {

	public int findMin(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return Math.min(nums[0], nums[1]);
		}

		int left = 0;
		int right = nums.length - 1;
		int middle = right / 2;


		while (true) {
			if (isElementAtIndexSmallest(nums, left)) return nums[left];
			if (isElementAtIndexSmallest(nums, right)) return nums[right];
			if (isElementAtIndexSmallest(nums, middle)) return nums[middle];


			if (nums[left] < nums[middle]) {
				left = middle;
			} else {
				right = middle;
			}
			middle = (right - left) / 2 + left;
		}

	}

	private boolean isElementAtIndexSmallest(int[] arr, int index) {
		int backIndex = index == 0 ? arr.length - 1 : index - 1;
		return arr[index] < arr[backIndex];
	}
}
