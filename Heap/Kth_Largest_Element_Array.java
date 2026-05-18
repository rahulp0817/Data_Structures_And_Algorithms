package Heap;

import java.util.PriorityQueue;

public class Kth_Largest_Element_Array {
  public int findKthLargest(int[] nums, int k) {

    // min heap
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int num : nums) {
      minHeap.add(num);

      if (minHeap.size() > k) {
        minHeap.poll(); // give the largest element
      }
    }

    return minHeap.peek(); // give the smallest one
  }
}
