/*Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0] */

class Solution {
    public int[] shortestToChar(String S, char C) {
        int num = S.length();
        int[] answers = new int[num];

        int prev = Integer.MIN_VALUE / 2;


        // Get all values to the right, store in array
        for(int i = 0; i < num; i++){
            if(S.charAt(i) == C)
                prev = i;
            answers[i] = i - prev;
        }

        // Get all values to the left, keep lowest
        prev = Integer.MAX_VALUE / 2;
        for(int i = num - 1; i >=0; --i){
            if(S.charAt(i) == C) prev = i;
            answers[i] = Math.min(answers[i], prev - i);
        }
       return answers;
    }
}
