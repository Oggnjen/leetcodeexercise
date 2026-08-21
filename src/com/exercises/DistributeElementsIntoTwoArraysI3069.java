package com.exercises;

public class DistributeElementsIntoTwoArraysI3069 {
	public int[] resultArray(int[] nums) {
		int[] result = new int[nums.length];
		int[] arr1 = new int[nums.length];
		int[] arr2 = new int[nums.length];
		arr1[0] = nums[0];
		int arr1Count = 0;
		arr2[0] = nums[1];
		int arr2Count = 0;
		for (int i = 2; i < nums.length; i++) {
			if (arr1[arr1Count] > arr2[arr2Count]) {
				arr1[++arr1Count] = nums[i];
			} else {
				arr2[++arr2Count] = nums[i];
			}
		}

		int k = 0;
		for (int i = 0; i <= arr1Count; i++) {
			result[i] = arr1[i];
			k++;
		}

		for (int i = 0; i <= arr2Count; i++) {
			result[k] =  arr2[i];
			k++;
		}

		return result;
	}
}
