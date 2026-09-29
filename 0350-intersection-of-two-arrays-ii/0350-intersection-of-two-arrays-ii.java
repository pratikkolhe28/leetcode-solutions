class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        int[] temp = new int[Math.max(nums1.length, nums2.length)];
        int k = 0;

        for(int num : nums1) {
            count[num]++;
        }

        for(int num : nums2) {
            if(count[num] > 0) {
                temp[k++] = num;
                count[num]--;
            }
        }

        return Arrays.copyOf(temp, k);
    }
}