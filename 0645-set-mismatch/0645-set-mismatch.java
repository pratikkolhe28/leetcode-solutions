class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                arr[0] = entry.getKey();
            }
        }

        for(int i = 1; i <= nums.length; i++) {
            if(!map.containsKey(i)) {
                arr[1] = i;
            }
        }

        return arr;
    }
}