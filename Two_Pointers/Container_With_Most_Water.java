package Two_Pointers;

public class Container_With_Most_Water {
  public int maxArea(int[] height) {

    int left = 0;
    int right = height.length - 1;
    int maxValue = 0;

    while (left < right) {
      int width = right - left;
      int ht = Math.min(height[left], height[right]);
      int area = width * ht;
      maxValue = Math.max(area, maxValue);

      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
      ;
    }
    ;

    return maxValue;
  }
}
