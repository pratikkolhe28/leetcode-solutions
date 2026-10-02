class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

// class Solution {
//     public int findDuplicate(int[] nums) {
//         Set<Integer> st = new HashSet<>();

//         for(int num : nums) {
//             if(!st.contains(num)) {
//                 st.add(num);
//             } else {
//                 return num;
//             }
//         }

//         return 0;
//     }
// }