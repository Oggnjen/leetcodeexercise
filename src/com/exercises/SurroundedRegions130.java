package com.exercises;

import java.util.*;

public class SurroundedRegions130 {
	Set<Coordinates> visited = new HashSet<Coordinates>();

	boolean containsEdge = false;

	int width = 0;
	int height = 0;

	public void solve(char[][] board) {
		this.width = board.length;
		this.height = board[0].length;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (visited.contains(new Coordinates(i, j))) {
					continue;
				}
				if (board[i][j] == 'O') {
					List<Coordinates> region = new ArrayList<>();
					checkRegion(board, i, j, region);
					if (!containsEdge) {
						region.forEach(c -> board[c.row][c.col] = 'X');
					}
					containsEdge = false;
				} else {
					visited.add(new Coordinates(i, j));
				}
			}
		}
	}

	private void checkRegion(char[][] board, int row, int col, List<Coordinates> region) {
		if (visited.contains(new Coordinates(row, col))) {
			return;
		}

		if (board[row][col] == 'O') {
			Queue<Coordinates> queue = new ArrayDeque<>();
			this.containsEdge = this.containsEdge || isEdge(board, row, col);
			region.add(new Coordinates(row, col));
			visited.add(new Coordinates(row, col));
			addToQueue(board, row, col, queue);
			while (!queue.isEmpty()) {
				Coordinates c = queue.poll();
				if (board[c.row][c.col] == 'O') {
					this.containsEdge = this.containsEdge || isEdge(board, c.row, c.col);
					region.add(c);
					addToQueue(board, c.row, c.col, queue);
				}
			}
		}



//		if (visited.contains(new Coordinates(row, col))) {
//			return;
//		}
//		if (board[row][col] == 'O') {
//			if (!region.contains(new Coordinates(row, col))) {
//				region.add(new Coordinates(row, col));
//			}
//			visited.add(new Coordinates(row, col));
//			this.containsEdge = this.containsEdge || isEdge(board, row, col);
//			if (row + 1 <= width - 1) {
//				checkRegion(board, row + 1, col, region);
//			}
//			if (row - 1 >= 0) {
//				checkRegion(board, row - 1, col, region);
//			}
//			if (col + 1 <= height - 1) {
//				checkRegion(board, row, col + 1, region);
//			}
//			if (col - 1 >= 0) {
//				checkRegion(board, row, col - 1, region);
//			}
//		} else {
//			visited.add(new Coordinates(row, col));
//		}


	}

	private boolean isEdge(char[][] board, int row, int col) {
		return row == 0 || col == 0 || row == board.length - 1 || col == board[0].length - 1;
	}

	private void addToQueue(char[][] board, int row, int col, Queue<Coordinates> queue) {
		if (row + 1 <= width - 1 && !visited.contains(new Coordinates(row + 1, col))) {
			visited.add(new Coordinates(row + 1, col));
			queue.add(new Coordinates(row + 1, col));
		}
		if (row - 1 >= 0 && !visited.contains(new Coordinates(row - 1, col))) {
			visited.add(new Coordinates(row - 1, col));
			queue.add(new Coordinates(row - 1, col));
		}
		if (col + 1 <= height - 1 && !visited.contains(new Coordinates(row, col + 1))) {
			visited.add(new Coordinates(row, col + 1));
			queue.add(new Coordinates(row, col + 1));
		}
		if (col - 1 >= 0 && !visited.contains(new Coordinates(row, col - 1))) {
			visited.add(new Coordinates(row, col - 1));
			queue.add(new Coordinates(row, col - 1));
		}
	}



	static class Coordinates {
		int row;
		int col;
		public Coordinates(int row, int col) {
			this.row = row;
			this.col = col;
		}

		@Override
		public boolean equals(Object o) {
			if (o == null || getClass() != o.getClass())
				return false;
			Coordinates that = (Coordinates) o;
			return row == that.row && col == that.col;
		}

		@Override
		public int hashCode() {
			return Objects.hash(row, col);
		}
	}
}
