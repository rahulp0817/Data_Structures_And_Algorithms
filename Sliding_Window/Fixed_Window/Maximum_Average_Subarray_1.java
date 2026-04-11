package Sliding_Window.Fixed_Window;

public class Maximum_Average_Subarray_1 {
  public double findMaxAverage(int[] nums, int k) {
    int sum_window = 0;
    // slide the window of size k and calculate the sum of the first window
    for (int i = 0; i < k; i++) {
      sum_window += nums[i];
    }

    int max_sum = sum_window;
    // slide the window and calculate the sum of the next window by adding the next element and removing the first element of the previous window
    for (int i = k; i < nums.length; i++) {
      sum_window += nums[i] - nums[i - k];
      max_sum = Math.max(max_sum, sum_window);
    }

    return (double) max_sum / k;

  }
}

// Time complexity: O(n) where n is the length of the input array
// space complexity: O(1) as we are using only a constant amount of space to store the sum of the current window and the maximum sum found so far.