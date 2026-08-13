class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x / 2;
        int ans = 0;

        if(x == 1)
        return 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if((long) mid*mid <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}