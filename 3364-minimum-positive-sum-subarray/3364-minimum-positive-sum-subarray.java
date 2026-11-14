class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.size(); i++) {
            sum = 0;

            for(int j = i; j < nums.size(); j++) {
                int length = j - i + 1;
                sum += nums.get(j);

                if(length >= l && length <= r && sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}