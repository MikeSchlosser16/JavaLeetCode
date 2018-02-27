/*Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

*/

class Solution {
    //3, 9, 27, 81 ...

    /* ex: n = 27
        27%3 == 0 true, n -> 27/3 = 9
        9 % 3 == 0 true, n-> 9/3 = 3
        3 % 3 == 0 true, n-> 3/3 = 1
        n ==1 - > true
    */
    /* ex2 n = 30
        30 % 3 == 0 true, n -> 30 / 3 = 10
        10 % 3 == 0 false, kick out
        n = 10 -> 10 != 1 return false
      */

    public boolean isPowerOfThree(int n) {
        if(n > 1){
            while (n % 3 == 0) {n = n / 3;}
        }
        return n == 1;
    }
}



// Bonus
// If log10(n) / log10(3) returns an int (more precisely, a double but has 0 after decimal point), then n is a power of 3.
// if n = 3^i, then i = log(n) / log(3), and thus comes to the solution
public boolean isPowerOfThree(int n) {
    return (Math.log10(n) / Math.log10(3)) % 1 == 0;
}
