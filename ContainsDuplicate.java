/* Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct. */

// Search and Instert on a Hashmap are O(1) in Java
// O(n) since we do search and insert for n elements
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map items = new HashMap();
        for (int number : nums){
            if (items.containsKey(number)){
                return true;
            }else {
                items.put(number, 1);
            }
        }
        return false;
    }

// Another approach is sorting array and then looking at i and i+1.
// Obviously, do not want to nested loop 