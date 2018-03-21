/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome. */



/*The java string replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.
O(n) iterating over each once
*/
class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for(int i=0; i < cleaned.length() / 2; i++){
            if(cleaned.charAt(i) != cleaned.charAt(cleaned.length() -1 - i)){
                return false;
            }
        }
        return true; 
    }
}