class Solution {
    public int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length - 1;
        int min = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(citations[mid] >= citations.length - mid) {
                min = citations.length - mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return min;
    }
}