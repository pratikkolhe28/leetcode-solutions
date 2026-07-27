class Solution {
    public boolean bs(int[] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(matrix[mid] == target) return true;
            else if (matrix[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;

        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] <= target && target <= matrix[i][m-1]) {
                return bs(matrix[i], target);
            }
        }
        return false;
    }
}