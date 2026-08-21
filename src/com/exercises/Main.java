package com.exercises;

import com.exercises.helperclasses.ListNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		SurroundedRegions130 alg = new SurroundedRegions130();
		char[][] board = new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
		alg.solve(board);
		System.out.println(Arrays.deepToString(board));
	}

}
