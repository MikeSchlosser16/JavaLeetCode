/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only. */


// Solution gets kind of long because I'm checking for edge cases in a bad way
// The solution to this would be much cleaner if I knew standard java string library better
// O(n)
class Solution {
	public int lengthOfLastWord(String s) {
	    String newStr = new StringBuilder(s).reverse().toString();
	    if(newStr.length() == 0){
	        return 0;
	    } else if (!newStr.contains(" ")){
	        return newStr.length();
	    }
	    if (newStr.charAt(0) == ' '){
	        newStr = newStr.substring(1, newStr.length());
	    }
	    for(int i = 0; i < newStr.length(); i++){
	        if (newStr.charAt(i) == ' '){
	            return i;
	        }
	    }
	    return -1;
	}
}


// Very consise solution using String.trim
// String.trim returns a copy of this string with leading and trailing white space removed
public int lengthOfLastWord(String s) {
    return s.trim().length()-s.trim().lastIndexOf(" ")-1;
}