package Two_Pointers;

public class Trapping_Rain_Water {
  public int trap(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxWater = 0;
    int leftmax = 0;
    int rightmax = 0;

    while (left < right) {
      if (height[left] < height[right]) {
        leftmax = Math.max(leftmax, height[left]);
        maxWater += leftmax - height[left];
        left++;
      } else {
        rightmax = Math.max(rightmax, height[right]);
        maxWater += rightmax - height[right];
        right--;
      }
    }

    return maxWater;

  }
}
