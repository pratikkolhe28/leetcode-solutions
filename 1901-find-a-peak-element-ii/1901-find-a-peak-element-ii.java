class Solution {
    public int maxElement(int[][] matrix, int mid) {
        int n = matrix.length;
        int row = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(max < matrix[i][mid]) {
                max = matrix[i][mid];
                row = i;
            }
        }

        return row;
    }

    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            int row = maxElement(mat, mid);

            int left = mid - 1 >= 0 ? mat[row][mid-1] : -1;
            int right = mid + 1 <= high ? mat[row][mid+1] : -1;

            if(left < mat[row][mid] && mat[row][mid] > right) return new int[] {row, mid};
            else if (mat[row][mid] < left) high = mid - 1;
            else low = mid + 1;
        }

        return new int[] {};
    }
}