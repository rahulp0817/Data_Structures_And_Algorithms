package Sliding_Window.Dynamic_Window;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_Maximum {
  public int[] maxSlidingWindow(int[] nums, int k) {
    // Store result + size of array
    int n = nums.length;
    int[] result = new int[n - k + 1];

    // Deque initilize indices
    Deque<Integer> deque = new ArrayDeque<>();

    // window
    for (int right = 0; right < n; right++) {

      // remove outsiders
      while (!deque.isEmpty() && deque.peekFirst() < right - k + 1) {
        deque.pollFirst();
      }

      // make order of it
      while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]) {
        deque.pollLast();
      }

      // Add to Deque
      deque.offerLast(right);

      // window format
      if (right >= k - 1) {
        result[right - k + 1] = nums[deque.peekFirst()];
      }
    }

    return result;
  }
}

// Time Complexity: O(n)
// Space Complexity: O(k)