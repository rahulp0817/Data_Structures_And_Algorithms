package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Next_Greater_Element_I {
  class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Deque<Integer> stack = new ArrayDeque<>();
      HashMap<Integer, Integer> map = new HashMap<>();

      int n = nums2.length;

      for (int i = n - 1; i >= 0; i--) {

        while (!stack.isEmpty() && stack.peek() < nums2[i]) {

          stack.pop();
        }

        if (stack.isEmpty()) {
          map.put(nums2[i], -1);
        } else {
          map.put(nums2[i], stack.peek());
        }

        stack.push(nums2[i]);
      }

      int[] result = new int[nums1.length];

      for (int i = 0; i < nums1.length; i++) {
        result[i] = map.get(nums1[i]);
      }

      return result;
    }
  }
}
