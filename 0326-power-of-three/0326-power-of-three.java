class Solution {
    public boolean isPowerOfThree(int n) {
        boolean result = false;
        if(n <= 0) {
            return result;
        }

        for(int i = 0; i <= Math.sqrt(n); i++) {
            if(Math.pow(3, i) == n)
            result = true;
        }

        return result;
    }
}