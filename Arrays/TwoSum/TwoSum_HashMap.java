package TwoSum;

import java.util.*;

public class TwoSum_HashMap {

  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int val = target - nums[i];

      if (map.containsKey(val)) {
        return new int[] { map.get(val), 0 };
      }

      map.put(nums[i], i);
    }
    return new int[] {};
  }
}
