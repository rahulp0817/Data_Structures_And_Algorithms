package LinkedList.Slow_And_Fast_Pointers;

public class Find_Duplicate_Number {
  public int findDuplicate(int[] nums) {
    int slow = nums[0];
    int fast = nums[0];

    // start the fast and slow pointer until they meet
    // use while loop initial both are at same point so not use the loop will not
    // run
    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (fast != slow);

    // as soon as they meet start the slow from start
    // move pointers at same speed until they meet
    slow = nums[0];

    while (fast != slow) {
      slow = nums[slow];
      fast = nums[fast];
    }

    return slow;
  }
}

// Time Complexity: O(n), where n is the length of the input array.
// Space Complexity: O(1), as we are using only a constant amount of extra space for the two pointers.