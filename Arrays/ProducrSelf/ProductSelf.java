// Leetcode 238
package Arrays.ProducrSelf;

public class ProductSelf {
    public int[] productExceptSelf(int[] nums) {

      int[] result = new int[nums.length];

      int leftproduct = 1;
      for(int i = 0; i < nums.length; i++){
       result[i] = leftproduct;
       leftproduct *= nums[i];
      }

      int rightproduct = 1;
      for(int i = nums.length - 1; i >= 0; i--){
        result[i] *= rightproduct; 
        rightproduct *= nums[i];
      }
     
      return result;

    }
}
