// Leetcode 189
// Time Complexity O(n)

class Solution {
    public void rotate(int[] nums, int k) {
        int i = nums.length;
        k = k % i;

        reverse(nums, 0, i - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, i - 1);

    }

    public void reverse(int[] nums, int start, int end){
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}