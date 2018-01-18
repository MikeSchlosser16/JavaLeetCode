/*For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.*/

// O(n)
// Simple - check numbers, if not zero move to front of array
// Then the remaning length to just be filled with zeros
class Solution {
    public void moveZeroes(int[] nums) {
        // Counter the number of nonzero elements
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[counter] = nums[i]; // If non zero, move to beginning of array
                counter++;
            }
        }
        
        while(counter < nums.length){ // The rest of the array should now be filled with zeros
            nums[counter] = 0;
            counter++; 
        }
        
    }
}