/*Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.

*/

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            // Good case, just add one and return
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                // If digits is 9, set it to zero
                // ie. 19 --> 9 -> 0, 1 -> 2
                digits[i] = 0;
            }
        }

        // Edge case where the entire array is 0's -- we need an extra spot and then its 1xxxx
        // ie. [9,9,9] -> [0,0,0] from above -> [1, 0, 0, 0] from here. Above return never hit
        int[] newNum = new int[digits.length+1];
        newNum[0] = 1;
        return digits;
    }
}
