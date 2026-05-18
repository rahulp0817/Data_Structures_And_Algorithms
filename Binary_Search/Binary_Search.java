package Binary_Search;

public class Binary_Search {
  public int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == target)
        return mid;
      else if (target > nums[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;
  }
}

// Time Complexity: O(log n) where n is the number of elements in the array.
// Space Complexity: O(1) since we are using only a constant amount of extra
// space

// Binary Search Rule

// Whenever mid can still be the answer:

// high = mid;

// Whenever mid is definitely NOT the answer:

// low = mid + 1;