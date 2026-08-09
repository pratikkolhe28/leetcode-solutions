class Solution {
    public boolean checkGoodInteger(int n) {
        boolean result = false;
        int squareSum = 0;
        int digitSum = 0;

        while(n > 0) {
            int rem = n % 10;
            digitSum += rem;
            squareSum += (rem*rem);
            n /= 10;
        }

        if(squareSum-digitSum >= 50) {
            result = true;
        } 

        return result;
    }
}