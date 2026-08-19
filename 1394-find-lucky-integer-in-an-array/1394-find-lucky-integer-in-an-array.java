class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLucky = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getKey().equals(entry.getValue())) {
                maxLucky = Math.max(maxLucky, entry.getKey());
            }
        }

        if(maxLucky > 0)
        return maxLucky;
        else
        return -1;
    }
}