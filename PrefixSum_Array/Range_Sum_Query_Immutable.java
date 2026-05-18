package PrefixSum_Array;

// Brute force approach: O(n * Q) time complexity for each query

// public class Range_Sum_Query_Immutable {
//   int[] nums; //store array

//     public Range_Sum_Query_Immutable(int[] nums) {
//         this.nums = nums;
//     }

//     public int sumRange(int left, int right) {
//         int sum = 0;
//         for(int k = left; k <= right; k++){ 
//             sum += nums[k];
//         }
//         return sum;
//     }
// }

// Optimized approach: O(n + Q) time complexity for each query
public class Range_Sum_Query_Immutable {
  int[] prefixSum; // store array

  public Range_Sum_Query_Immutable(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
    this.prefixSum = nums;
  }

  public int sumRange(int left, int right) {
    if (left == 0) {
      return prefixSum[right];
    }

    return prefixSum[right] - prefixSum[left - 1];
  }
}
