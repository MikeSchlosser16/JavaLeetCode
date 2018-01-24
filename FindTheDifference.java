
//Initial solution. Works but not if numbers duplicate.
// This would be a good question to clairfy in interview.
class Solution {
    public char findTheDifference(String s, String t) {
        ArrayList<Character> initialList = new ArrayList();
        for(Character ch : s.toCharArray()){
            initialList.add(ch);
        }
        for(Character ch : t.toCharArray()){
            if (!initialList.contains(ch)) return ch;
        }
         throw new IllegalArgumentException("No absent num");
    }
}


//Smart solution, difference must be the the char
public class Solution {
    public char findTheDifference(String s, String t) {
        // Initialize variables to store sum of ASCII codes for each string
        int charCodeS = 0, charCodeT = 0;
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) charCodeS += (int)s.charAt(i);
        for (int i = 0; i < t.length(); ++i) charCodeT += (int)t.charAt(i);
        // Return the difference between 2 strings as char
        return (char)(charCodeT - charCodeS);
    }
}