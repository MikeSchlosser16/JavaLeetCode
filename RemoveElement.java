/*Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2. */



/* Pretty simple
Start i at 0, those are the accepeted values(values not == val)
Iterate over array, and start copying back to start of array.
i then is the number of good elements.*/
class Solution {
    public int removeElement(int[] nums, int val) {
      int i = 0;
      for(int j = 0; j < nums.length; j++){
        if(nums[j] != val){
          nums[i] = nums[j];
          i++;
        }
      }
      return i;
    }
}
