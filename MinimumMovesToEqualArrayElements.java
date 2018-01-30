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

/* Do some math and the ans will be sum-min * length
Eg. [1, 2, 3]

(1–1) + (2–1) + (3–1) = (1 + 2 + 3)-1 * 3
*/

/*  sum = sum of all items in nums
    m   = number of moves --- TRYING TO SOLVE FOR MOVES
    x   = value of all items in nums after m moves
    n   = number of items in nums

    Then:

    sum = x * n
    For each move, we can add (n-1) to the sum, so
    for m moves add ---> m * (n-1)
    then x * n = sum + m * (n-1) -- EQ 1

    smallest num is the smallest before moves. After m moves, it is == x
    smallest + m = x -- EQ 2

	thus:

	from EQ 1 --> x = (sum + m * (n-1)) / n
	sub in for x in EQ 2 -- > smallest + m = sum + m * (n-1) / n
	multiply by n to cancel denominator --> (smallest*n) + (m*n) = sum  + m * (n-1)									     
   	Distribute m --> (smallest*n) + (m*n) = sum + (m*n) - m
	Cancel m*n term --> (smallest*n) = sum - m
	Solve for m --> m = sum - (smallest * n)

	Seems hard, but just need to set up system of equations so to speak. Or just realize adding 1 to n-1 the same as decrementing 1 element by 1..
	*/



