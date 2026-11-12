class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int pd = 1;
        int sd = 1;
        int p = 1;
        int s = 1;

        for(int i = 0; i < nums.length; i++) {
            pd = pd * p;
            p = nums[i];
            result[i] = pd;
        }

        for(int i = 0; i < nums.length; i++) {
            sd = sd * s;
            s = nums[nums.length - i - 1];
            result[nums.length - i - 1] = result[nums.length - i - 1] * sd;
        }

        return result;
    }
}