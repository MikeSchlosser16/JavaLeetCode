/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. */





// Time Complexity: O(n^2)
// Brute force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                	return new int[]{i,j}
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }                    
}


//Using a hasmap
//O(n)
//Hash map supports look up in constant time. We are sacrificing space for speed here. 
class Solution{
	public int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		//Add each elements value and its index to a hash table
		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], i);
		}
		//Check if elements 'complement' exists
		for(int i = 0; i < nums.length; i++){
			int compliment = target - nums[i];
			if(map.containsKey(compliment) && map.compliment != i){
				return new int[]{i, map.get(compliment)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}

