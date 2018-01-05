/*Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

        The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

        Example 1:
        Input: "UD"
        Output: true
        Example 2:
        Input: "LL"
        Output: false
*/



// The break statements are necessary because without them, statements in switch blocks fall through: All statements after the matching case label are executed in sequence, regardless of the expression of subsequent case labels, until a break statement is encountered.
// O(n)
class Solution {
    public boolean judgeCircle(String moves) {
        int U = 0; int D = 0; int L = 0; int R = 0;

        for(int i = 0; i < moves.length(); i++){
            char ch = moves.charAt(i);
            switch(ch){
                case 'U': U += 1; break;
                case 'D': D += 1; break;
                case 'L': L += 1; break;
                case 'R': R += 1; break;
                default: break;
            }
        }
        System.out.println(U);
        System.out.println(D);

        return ( (U == D) && (L == R) );
    }
}