package Binary_Search;

public class Koko_Eating_Bananas {
  public int minEatingSpeed(int[] piles, int h) {
    int low = 1;
    int high = 0;

    // max element
    for (int pile : piles) {
      high = Math.max(high, pile);
    }

    while (low < high) { // O(log(maxPile))
      int mid = low + (high - low) / 2;

      int totalhrs = 0;

      // total hrs
      for (int pile : piles) { // O(n)
        totalhrs += (pile + mid - 1) / mid;
      }

      if (totalhrs <= h) {
        high = mid; // left
      } else {
        low = mid + 1; // right
      }
    }

    return low;
  }
}

// Time Complexity: O(n log m) where n is the number of piles and m is the maximum pile size.
// or -> O(n log(maxpile))
// Space Complexity: O(1) since we are using only a constant amount of extra space