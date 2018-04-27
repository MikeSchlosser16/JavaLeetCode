/*
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input:
nums =
[[1,2],
 [3,4]]
r = 1, c = 4
Output:
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
*/

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] reshaped = new int[r][c];

        // Bad input matrix -- the given output size, r * c must be == the size of the input matrix
         if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;

        int rows = 0, columns = 0;
        // int columns = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                reshaped[rows][columns] = nums[i][j];
                columns++;
                if (columns == c) { // Finished entire column, need to go to the next row and then go thru those columns to reshape
                    rows++;
                    columns = 0;
                }
            }
        }
        return reshaped;
    }
}
