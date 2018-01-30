/*Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

Example:

Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
*/


// Adding 1 to n - 1 elements is the same as subtracting 1 from 1 element here
// We can then get the min number, and makes the rest of the array equal to that
// By decrementing 1 element at a time
class Solution {
    public int minMoves(int[] nums) {
        
        int min = nums[0];
        for (int num : nums) if (num < min) min = num;

        int moves = 0;
        for (int num : nums) moves += (num - min);
        return moves;
    }
}