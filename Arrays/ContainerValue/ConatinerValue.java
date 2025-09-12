// Leetcode 11
package Arrays.ContainerValue;
class ContainerValue {
    public int maxArea(int[] height) {

        int leftBar = 0;
        int rightBar = height.length - 1;
        int maxValue = 0;

        while(leftBar < rightBar){
            int width = rightBar - leftBar;
            int heights = Math.min(height[leftBar], height[rightBar]);
            int area = width*heights;
            maxValue = Math.max(maxValue, area);

            if (height[leftBar] < height[rightBar]) {
                leftBar++;
            } else{
                rightBar--;
            }
        }

        return maxValue;
    }
}