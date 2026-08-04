class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            set.add(nums[i]);
        }
        
        for(int i = min; i <= max; i++) {
            if(!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}

// int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         List<Integer> ans = new ArrayList<>();

//         for(int i = 0; i < nums.length; i++) {
//             min = Math.min(min, nums[i]);
//             max = Math.max(max, nums[i]);
//         }

//         for(int i = min; i <= max; i++) {
//             boolean found = false;

//             for(int j = 0; j < nums.length; j++) {
//                 if(nums[j] == i) {
//                     found = true;
//                     break;
//                 }
//             }

//             if(!found) {
//                 ans.add(i);
//             }
//         }

//         return ans;