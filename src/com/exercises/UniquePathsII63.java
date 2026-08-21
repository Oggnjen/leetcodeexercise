package com.exercises;

public class UniquePathsII63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int[][] paths = new int[obstacleGrid.length][obstacleGrid[0].length];
		for (int i = 0; i < obstacleGrid.length; i++) {
			for (int j = 0; j < obstacleGrid[0].length; j++) {
				if ((i == 0 || j == 0) && canApproach(i, j, obstacleGrid)) {
					if (i == 0 && j == 0) {
						paths[i][j] = 1;
					} else if (i == 0) {
						paths[i][j] = paths[i][j - 1];
					} else {
						paths[i][j] = paths[i - 1][j];
					}
					continue;
				} else if (i == 0 || j == 0) {
					paths[i][j] = 0;
					continue;
				}
				if (canApproach(i, j, obstacleGrid)) {
					paths[i][j] = paths[i-1][j] + paths[i][j-1];
				} else {
					paths[i][j] = 0;
				}

			}
		}
		return paths[obstacleGrid.length-1][obstacleGrid[0].length-1];
	}

	private boolean canApproach(int row, int col, int[][] obstacleGrid) {
		if (obstacleGrid[row][col] == 1) {
			return false;
		}
		if (row == 0 && col == 0) {
			return true;
		}
		if (row == 0) {
			return obstacleGrid[row][col - 1] != 1;
		}
		if (col == 0) {
			return obstacleGrid[row - 1][col] != 1;
		}

		return obstacleGrid[row][col - 1] != 1 || obstacleGrid[row - 1][col] != 1;
	}
}
