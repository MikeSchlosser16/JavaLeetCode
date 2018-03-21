/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1

Input: [3,0,1]
Output: 2
Example 2

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
*/

// Looks like this can also be done using XOR easily.

class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer, Integer> values = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            values.put(nums[i],1);
        }

        for(int i = 0; i <= nums.length; i++){
            if(!values.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}

// Another way I thought of using math..

class Solution {
    public int missingNumber(int[] nums) {
        int expected = 0;
        int real = 0;

        for(int i = 0; i < nums.length + 1; i++){
            expected += i;
        }
        for(int num : nums){
            real += num;
        }
        return expected-real;
    }
}


// Same as above but more elegant
class Solution {
  public static int missingNumber(int[] nums) {
      int sum = nums.length;
      for (int i = 0; i < nums.length; i++)
          sum += i - nums[i];
      return sum;
      }
}
