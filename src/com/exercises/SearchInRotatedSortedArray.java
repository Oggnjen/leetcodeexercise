package com.exercises;

public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {
		if (nums.length == 1) {
			return nums[0] == target ? 0 : -1;
		}
		if (nums.length == 2) {
			if (nums[0] == target) return 0;
			else if (nums[1] == target) return 1;
			else return -1;
		}

		int left = 0;
		int right = nums.length - 1;
		int middle = right / 2;


		while (true) {
			if (nums[left] == target) return left;
			if (nums[right] == target) return right;
			if (nums[middle] == target) return middle;

			if (left == middle || middle == right) {
				return -1;
			}

			if (nums[middle] < target && nums[right] > target) {
				left = middle;
			} else if (nums[middle] > nums[right]) {
				if (nums[middle] < target || nums[right] > target) {
					left = middle;
				} else {
					right = middle;
				}
			} else {
				right = middle;
			}

			middle = (right - left) / 2 + left;
		}
	}
}
