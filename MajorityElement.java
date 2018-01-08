/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.*/

// O(n) using hasmap
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> numberMap = new HashMap();
        //Array.length vs String.length()
        for (int i = 0; i < nums.length; i++) {
            if (numberMap.containsKey(nums[i])) {
                numberMap.put(nums[i], (int) numberMap.get(nums[i]) + 1);
            } else {
                numberMap.put(nums[i], 1);
            }
            if (numberMap.get(nums[i])  > (nums.length / 2)) {
                return nums[i];
            }

        }
        throw new IllegalArgumentException("No majority element");
    }
}


// More elegant code from the solution -- not including the main part of function here
class Solution {
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }


// A O(nlogn) solution. This is much cleaner and better. 
// If we sort, the majority must be the middle element. So just use that
// Sorting array is O(nlogn)
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}