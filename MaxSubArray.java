/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum < 0) sum = nums[i];
            else{
                sum += nums[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}



// Brute force, checking all sub arrays
public static int maxSubArray(int[] nums) {
    int ans = Integer.MIN_VALUE;
    for(int sub_array_size = 1; sub_array_size <= nums.length; sub_array_size++){
        System.out.println("Summing for size: " + sub_array_size + " elements");
        for(int start_index = 0; start_index < nums.length; start_index++){

            if(start_index + sub_array_size > nums.length){
                System.out.println("    Not enough size left to make array valid for: " + start_index);
                break;
            }else{
                System.out.println("    Starting at index:" + start_index);
            }
            int sum = 0;

            for(int i = start_index; i < sub_array_size + start_index; i++){
                sum += nums[i];
                if(sum > ans){
                    ans = sum;
                }
            }
            System.out.println("        Sum: " + sum);
        }
        System.out.println("After Summing for size: " + sub_array_size + ", new max is: " + ans);
    }
    return ans;
}
