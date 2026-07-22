class Solution {
    public int countStud(int[] nums, int pages) {
        int students = 1;
        int pagesStudent = 0;

        for(int i = 0; i < nums.length; i++) {
            if(pagesStudent + nums[i] <= pages) {
                pagesStudent += nums[i];
            } else {
                students++;
                pagesStudent = nums[i];
            }
        }

        return students;
    }

    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while(low <= high) {
            int mid = low + (high-low) / 2;

            int stud = countStud(nums, mid);

            if(stud > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}