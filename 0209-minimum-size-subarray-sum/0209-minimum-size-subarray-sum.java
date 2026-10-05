class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        boolean valid = false;
        int sum = nums[left];

        while(right < nums.length) {
            if(sum >= target) {
                sum = sum - nums[left];
                int length = right - left + 1;
                minLength = Math.min(minLength, length);
                valid = true;
                left++;
            } else {
                if(right < nums.length - 1) {
                    right++;
                    sum = sum + nums[right];
                } else {
                    break;
                }
            }
        }

        if(!valid) {
            return 0;
        }
        return minLength;
    }
}