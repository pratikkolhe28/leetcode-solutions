import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        boolean[] present = new boolean[nums.length + 1];
        for (int num : nums) {
            present[num] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                list.add(i); 
            }
        }

        return list;
    }
}



// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         List<Integer> list = new ArrayList<>();

//         for(int i = 1; i <= nums.length; i++) {
//             boolean yes = false;
//             for(int j = 0; j < nums.length; j++) {
//                 if(i == nums[j]) {
//                     yes = true;
//                 }
//             }

//             if(yes != true) {
//                 list.add(i);
//             }
//         }

//         return list;
//     }
// }