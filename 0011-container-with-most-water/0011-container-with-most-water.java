class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while(left < right) {
            int hgt = Math.min(height[left], height[right]);
            int dist = right - left;
            maxWater = Math.max(maxWater, hgt*dist);

            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}