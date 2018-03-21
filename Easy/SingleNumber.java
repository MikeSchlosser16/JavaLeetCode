/*Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/


// Using Hashmap O(n)
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numberMap = new HashMap();
        for(int num: nums){
            if(numberMap.containsKey(num)){
                numberMap.put(num, (int) numberMap.get(num) +  1);
            }else{
                numberMap.put(num, 1);
            }
        }
        for ( Integer key : numberMap.keySet()) {
            if(numberMap.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}


// Using bitwise exclusive OR and assignment operator.
// Much cleaner, faster
public int singleNumber(int[] nums) {
    int result = 0;
    for(int i : nums) {
        result ^= i;
    }
    return result;
}