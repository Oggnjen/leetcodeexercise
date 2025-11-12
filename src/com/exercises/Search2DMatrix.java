package com.exercises;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int lastCol = matrix[0].length - 1;
        for(int i = 0; i <= matrix.length - 1; i++) {
            if (matrix[i][0] <= target && matrix[i][lastCol] >= target) {
                int start = 0;
                int end = lastCol;
                while(true) {
                    int middle = (end - start) / 2 + start;
                    if (matrix[i][start] == target) {
                        return true;
                    }
                    if (matrix[i][end] == target) {
                        return true;
                    }
                    if (matrix[i][middle] == target) {
                        return true;
                    }

                    if (matrix[i][middle] > target) {
                        end = middle;
                    } else {
                        start = middle;
                    }
                    if (end - start == 1 || end == start) {
                        if (matrix[i][start] == target) {
                            return true;
                        }
                        if (matrix[i][end] == target) {
                            return true;
                        }
                        return false;
                    }
                }
            }
        }

        return false;
    }
}
