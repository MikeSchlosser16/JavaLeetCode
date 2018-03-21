/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.*/


//Converting chars to ints
//Put in the array at the 'spot of the char' with the value
// Then check only those values to see if 1
public int firstUniqChar(String s) {
    if(s.length() == 0) return -1;
    int[] occurances = new int[26];
    for(int i = 0; i < s.length(); i++) occurances[s.charAt(i) - 'a'] += 1;
    for(int i = 0; i < s.length(); i++)
        if(occurances[s.charAt(i) - 'a'] == 1) return i;
    return -1;
}