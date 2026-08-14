class Solution {
    public boolean isTrionic(int[] nums) {
        int phase = 0;
        boolean firstIncreasing = false;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1]) {

                if (phase == 0) {
                    firstIncreasing = true;
                } 
                else if (phase == 1) {
                    phase = 2;
                }

            } else if (nums[i] > nums[i + 1]) {

                if (!firstIncreasing || phase == 2) {
                    return false;
                }

                phase = 1;

            } else {
                return false;
            }
        }

        return phase == 2;
    }
}