/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2
*/

class Solution {
    public int findComplement(int num) {
      
        // Convert to binary
        String binary = "";
        while(num > 0){
            binary += num % 2;
            num = num / 2;
        }

        // Invert to get compliment
        String compliment = "";
        for(Character digit : binary.toCharArray()){
            compliment += (digit == '1') ? ('0') : ('1');
        }

        // Convert back to base 10 -- decimal number is equal to the sum of binary digits (dn) times their power of 2 (2n):
        Integer complimentBaseTen = 0;
        for(int i = compliment.length(); i > 0; i--){
            complimentBaseTen += Character.getNumericValue(compliment.charAt(i - 1)) * (int) Math.pow(2,i - 1);
          }
        return complimentBaseTen;
      }
}
