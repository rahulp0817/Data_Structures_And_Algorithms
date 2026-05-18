package Binary_Search;

public class Search_2D_Matrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length; // rows
    int n = matrix[0].length; // cols

    int left = 0;
    int right = m * n - 1; // flattend the 2D matrix into 1D

    while (left <= right) {

      int mid = left + (right - left) / 2;

      int row = mid / n;
      int col = mid % n;

      int value = matrix[row][col];
      if (value == target) {
        return true;
      } else if (target > value) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return false;
  }
}
