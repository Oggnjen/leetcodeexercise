package com.exercises;

import java.util.HashMap;

public class MaximumCompatibilityScoreSum1947 {
	public int maxCompatibilitySum(int[][] students, int[][] mentors) {
		int[] mask = new int[(2 << students.length)];
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < mentors.length; j++) {
			}

		}
		return 0;
	}

	private int calculateScore(int[] x, int[] y) {
		int score = 0;
		for (int i = 0; i < x.length; i++) {
			if  (x[i] == y[i]) score += 1;
		}
		return score;
	}

	public int binaryArrayToInt(int[] binaryArray) {
		int result = 0;
		for (int bit : binaryArray) {
			// Shift existing bits left and add the new bit
			result = (result << 1) | bit;
		}
		return result;
	}
}
