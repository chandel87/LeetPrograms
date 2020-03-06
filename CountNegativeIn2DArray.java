/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/submissions/
 * 1351. Count Negative Numbers in a Sorted Matrix
 * Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise. 
 * Return the number of negative numbers in grid.
 */

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = grid[i].length-1; j >= 0; j--){
                if(grid[i][j] < 0){
                    count++;
                } else break;
            }
        }
        return count;
    }
}