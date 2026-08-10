class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int n = nums.length-1;
        int[] ans = new int[n+1]; 

        for(int i = n; i >= 0; i--) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[i] = nums[left]*nums[left];
                left++;
            } else {
                ans[i] = nums[right]*nums[right];
                right--;
            }
        }

        return ans;
    }
}

// for(int i = 0; i < nums.length; i++) {
//             nums[i] = nums[i] * nums[i];
//         }

//         Arrays.sort(nums);
//         return nums;