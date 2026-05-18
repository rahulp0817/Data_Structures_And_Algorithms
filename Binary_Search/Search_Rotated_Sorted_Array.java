package Binary_Search;

public class Search_Rotated_Sorted_Array {
  public int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (target == nums[mid])
        return mid;

      // left side
      if (nums[low] <= nums[mid]) {

        if (target >= nums[low] && target < nums[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      }

      // right side
      else {
        if (target > nums[mid] && target <= nums[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }

    return -1;
  }
}

// Time Complexity: O(log n) where n is the number of elements in the array.
// Space Complexity: O(1) since we are using only a constant amount of extra