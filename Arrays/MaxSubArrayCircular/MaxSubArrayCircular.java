package Arrays.MaxSubArrayCircular;

public class MaxSubArrayCircular {
  public int maxSubarraySumCircular(int[] nums) {
        
        int maxSum = nums[0];
        int minSum = nums[0];
        int currentSum = nums[0];
        int totalSum = nums[0];
        int currentMin = nums[0];

        for(int i = 1; i < nums.length; i++) {
            totalSum += nums[i]; 

            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);

            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        } 

        if (maxSum < 0) return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}
