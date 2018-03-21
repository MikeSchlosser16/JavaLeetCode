/*Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.*/

// A perfect square is 1+3+5+7+...
// Thus, we can start with the number and subtract those numbers
// Keep going until we are either less than or equal to 0
// If we are equal to zero, we much be a perfect square
class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i = 1; num > 0; i+=2)
            num -= i;
        return num == 0;

    }
}

