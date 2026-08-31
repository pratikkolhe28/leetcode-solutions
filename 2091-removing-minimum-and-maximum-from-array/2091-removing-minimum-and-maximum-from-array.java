class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if(nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int front = right + 1;
        int back = nums.length - left;
        int both = (left + 1) + (nums.length - right);

        return Math.min(front, Math.min(back, both));
    }
}