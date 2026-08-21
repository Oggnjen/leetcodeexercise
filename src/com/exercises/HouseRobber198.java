package com.exercises;

public class HouseRobber198 {


	public int rob(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}
		int[] values = new int[nums.length];
		values[0] = nums[0];
		values[1] = nums[1];
		values[2] = nums[0] + nums[2];
		for (int i = 3; i < nums.length; i++) {
			values[i] = Math.max(values[i - 2] + nums[i], values[i - 3] + nums[i]);
		}
		return Math.max(values[values.length - 2], values[values.length - 1]);
	}
}
