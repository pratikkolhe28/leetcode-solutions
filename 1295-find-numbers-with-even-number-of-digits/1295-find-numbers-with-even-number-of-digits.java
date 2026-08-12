class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int length = 0;
            while(nums[i] > 0) {
                int r = nums[i] % 10;
                length++;
                nums[i] = nums[i] / 10;
            }
            
            if(length % 2 == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}