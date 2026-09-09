class Solution {
    public int countCommas(int n) {
        long commas = 0;

        if(n < 1000) {
            commas = 0;
        } else if (n <= 999999) {
            commas += n - 999;
        } else if (n <= 999999999) {
            commas += n - 999;
            commas += (n - 999999) * 2;
        } else if (n <= 999999999999L) {
            commas += n - 999;
            commas += (n - 999999) * 2;
            commas += (n - 999999999) * 3;
        } else if (n <= 999999999999999L) {
            commas += n - 999;
            commas += (n - 999999) * 2;
            commas += (n - 999999999) * 3;
            commas += (n - 999999999999L) * 4;
        } else if (n <= 999999999999999999L) {
            commas += n - 999;
            commas += (n - 999999) * 2;
            commas += (n - 999999999) * 3;
            commas += (n - 999999999999L) * 4;
            commas += (n - 999999999999999L) * 5;
        }

        return (int) commas;
    }
}