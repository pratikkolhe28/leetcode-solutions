class Solution {
    public int oneDigit(int num) {
        int n = 0;
        while(num > 0) {
            int r = num % 10;
            n = n + r;
            num = num / 10;
        }
        return n;
    }

    public int addDigits(int num) {
        while(num > 9) {
            num = oneDigit(num);
        }

        return num;
    }
}