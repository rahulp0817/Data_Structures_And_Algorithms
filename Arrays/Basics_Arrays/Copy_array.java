package Arrays.Basics_Arrays;
import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        return ans;
    }
}

public class Copy_array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        Solution sol = new Solution();
        int[] result = sol.getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }
}
