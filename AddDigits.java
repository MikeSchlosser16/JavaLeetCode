/* 
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?*/


// Obvious way, only one I could think of
// Uses recursion
class Solution {
    public int addDigits(int num) {
        if(Integer.toString(num).length() == 1){
            return num;
        }else{
            int newTotal = 0;
            String converted = Integer.toString(num);
            for(int i = 0; i < converted.length(); i++){
                newTotal += Character.getNumericValue(converted.charAt(i));
            }
            return addDigits(newTotal);
        }

    }
}


// Clever way using math
/* In mathematics we have learnt that any number that is divisible by 9,
the sum of the digits in the number is also divisible by 9. Also, here we know
 that the result of the problem is an integer lying in the range [0,9].
 From the above arguments and samples, we can see that the result depends on the divisibility of a number by 9. */


public int addDigits(int num) {
	if(num<10)
	    return num;
	else if(num%9 ==0)
	    return 9;
	else
	    return num%9;        
}