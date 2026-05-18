package Heap;

import java.util.PriorityQueue;

public class Kth_Largest_Stream {
  PriorityQueue<Integer> minHeap;
  private int k;

  public Kth_Largest_Stream(int k, int[] nums) {
    this.k = k;
    minHeap = new PriorityQueue<>();

    for (int num : nums) {
      add(num); // O(log k) for each element, total O(n log k)
    }

  }

  public int add(int val) {
    minHeap.add(val);

    if (minHeap.size() > k) {
      minHeap.poll();
    }

    return minHeap.peek();
  }
}

// Space Complexity: O(k) for the min-heap
// Time Complexity: O(n log k)