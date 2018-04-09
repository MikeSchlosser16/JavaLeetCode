/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

class Solution {
    public String reverseString(String s) {
        String retStr = "";
        for(int i = s.length() - 1; i >= 0; i--){
            retStr += s.charAt(i);
        }
        return retStr;
    }
}


class Solution {
  public String reverseString(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}
