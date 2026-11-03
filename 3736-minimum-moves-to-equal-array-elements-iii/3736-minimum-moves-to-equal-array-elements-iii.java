class Solution {
    public int minMoves(int[] nums) {
        int largest = Arrays.stream(nums).max().getAsInt();
        int moves = 0;

        for(int i = 0; i < nums.length; i++) {
            moves = moves + Math.abs(nums[i] - largest);
        }

        return moves;
    }
}