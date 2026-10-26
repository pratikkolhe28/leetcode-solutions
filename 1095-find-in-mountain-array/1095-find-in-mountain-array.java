/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;

        if(mountainArr.length() < 3) {
            return -1;
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(mountainArr.get(mid) < mountainArr.get(mid+1)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int peakIndex = low;
        high = low;
        low = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int val = mountainArr.get(mid);

            if(val == target) {
                return mid;
            } else if(val > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = mountainArr.length() - 1;
        high = peakIndex + 1;

        while(low >= high) {
            int mid = high + (low - high) / 2;
            int val = mountainArr.get(mid);

            if(val == target) {
                return mid;
            } else if(target > val) {
                low = mid - 1;
            } else {
                high = mid + 1; 
            }
        }

        return -1;
    }
}