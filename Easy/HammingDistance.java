/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different./*

class Solution {
      /*(decimal)    (binary)
            5     =  101
            6     =  110
        ----------------- xor
            3     =  011   */

        /*12 = 00001100 (In Binary)
        25 = 00011001 (In Binary)

        Bit Operation of 12 and 25
        00001100
    &   00011001
        ________
        00001000  = 8 (In decimal)*/

    public int hammingDistance(int x, int y) {
        //Using bitwise XOR
        int n = x ^ y;
        int bitCount = 0;
        for(int i = 0; i < 32; i++){
            bitCount += (n >> i) & 1;
        }
        return bitCount;
    }
}
