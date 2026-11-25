class Solution {
    public int maxProduct(int n) {
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;

        while(n > 0) {
            int d = n % 10;

            if(num1 < d) {
                num2 = num1;
                num1 = d;
            } else {
                num2 = Math.max(num2, d);
            }

            n = n / 10;
        }

        return num1 * num2;
    }
}