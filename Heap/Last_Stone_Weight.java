package Heap;

import java.util.PriorityQueue;

public class Last_Stone_Weight {
  public int lastStoneWeight(int[] stones) {
    // declare Queue
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);

    // Add elements
    for (int stone : stones) {
      maxHeap.offer(stone); // O(log n)
    }

    while (maxHeap.size() > 1) {
      int y = maxHeap.poll(); // largest element
      int x = maxHeap.poll(); // second largest element

      if (x != y) {
        maxHeap.offer(y - x);
      }
    }

    return maxHeap.isEmpty() ? 0 : maxHeap.poll();

  }
}

// Time Complexity: O(n log n)
// Space Complexity: O(n)