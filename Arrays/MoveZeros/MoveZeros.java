// Leetcode 283
// Two pointers method
// Time complexity - O(n)

package Arrays.MoveZeros;

class MoveZeros {
    public void moveZeroes(int[] nums) {
        if (nums == null) return;

        int left = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
       
    }
}