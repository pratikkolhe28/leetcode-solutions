class Solution {
    public long countCommas(long n) {
        long commas = 0;

        if (n < 1000) {
            return 0;
        }

        // 1000 -> n
        if (n <= 999999) {
            return n - 999;
        }

        // Complete 1-comma range: 1000 -> 999999
        commas += 999000;

        // 1000000 -> n
        if (n <= 999999999) {
            commas += (n - 999999) * 2;
            return commas;
        }

        // Complete 2-comma range
        commas += 999000000L * 2;

        // 1000000000 -> n
        if (n <= 999999999999L) {
            commas += (n - 999999999) * 3;
            return commas;
        }

        // Complete 3-comma range
        commas += 999000000000L * 3;

        // 1000000000000 -> n
        if (n <= 999999999999999L) {
            commas += (n - 999999999999L) * 4;
            return commas;
        }

        // Complete 4-comma range
        commas += 999000000000000L * 4;

        // 1000000000000000 -> n
        commas += (n - 999999999999999L) * 5;

        return commas;
    }
}