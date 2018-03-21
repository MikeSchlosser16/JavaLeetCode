/* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A". */

// O(n^2)?
// IndexOf loops over..
class Solution {
    public int numJewelsInStones(String J, String S) {
        // J -> Type of stone that are jewel
        // S -> Stones we have
        
        int jewels = 0;
        for(char stone : S.toCharArray()){
            if(J.indexOf(stone) >= 0) jewels++; //indexOf returns index of -1 if not found
        }
        return jewels;
    }
}



// Using a HashSet
// This class implements the Set interface, backed by a hash table (actually a HashMap instance)
// This class offers constant time performance for the basic operations (add, remove, contains and size), assuming the hash function disperses the elements properly among the buckets. Iterating over this set requires time proportional to the sum of the HashSet instance's size (the number of elements) plus the "capacity" of the backing HashMap instance (the number of buckets). Thus, it's very important not to set the initial capacity too high (or the load factor too low) if iteration performance is important.
// https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
// Set only allows items once
class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for (Character c: J.toCharArray()) {
            set.add(c); // Only add once, set no duplicates
        }
        int count = 0;
        for (Character c: S.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}