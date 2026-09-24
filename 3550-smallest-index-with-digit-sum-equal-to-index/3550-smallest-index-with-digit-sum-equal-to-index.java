class Solution {
    public int smallestIndex(int[] nums) {
        int result =  -1;
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int r = 0;
            while(n > 0) {
                int d = n % 10;
                r = r + d;
                n = n / 10;
            }

            if(r == i) {
                result = i;
                break;
            }
        }

        return result;
    }
}