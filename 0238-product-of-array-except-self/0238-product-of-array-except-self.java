
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;

        for(int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;

        for(int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }

        return result;
    }
}



// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] result = new int[nums.length];
//         int pd = 1;
//         int sd = 1;
//         int p = 1;
//         int s = 1;

//         for(int i = 0; i < nums.length; i++) {
//             pd = pd * p;
//             p = nums[i];
//             result[i] = pd;
//         }

//         for(int i = 0; i < nums.length; i++) {
//             sd = sd * s;
//             s = nums[nums.length - i - 1];
//             result[nums.length - i - 1] = result[nums.length - i - 1] * sd;
//         }

//         return result;
//     }
// }