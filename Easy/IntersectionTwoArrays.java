/*

Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/


// O(n) -- sets cant have duplicates.
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> values = new HashSet<>();
        Set<Integer> intersections = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            values.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (values.contains(nums2[i])) {
                intersections.add(nums2[i]);
            }
        }
        int[] result = new int[intersections.size()];
        int i = 0;
        for (Integer num : intersections) {
            result[i++] = num;
        }
        return result;
    }

}



// Sort arrays -- Maybe more complex, but O(nlogn)
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    }
}

// Binary search, we just call it on the whole array with target iterated over O(nlogn)
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }
        int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[i++] = num;
        }
        return result;
    }

    public boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
