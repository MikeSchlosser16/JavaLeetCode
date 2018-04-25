/*
A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

Now given an M x N matrix, return True if and only if the matrix is Toeplitz.


Example 1:

Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: True
Explanation:
1234
5123
9512

In the above grid, the diagonals are "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]", and in eac
*/


// matrix.length == Rows
// matrix[0].length == Columns
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length - 1; i++){
            for(int j = 0; j < matrix[0].length - 1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}
