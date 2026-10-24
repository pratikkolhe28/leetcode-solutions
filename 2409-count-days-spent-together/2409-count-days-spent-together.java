class Solution {
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int convert(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int days = Integer.parseInt(date.substring(3, 5));

        int total = days;

        for(int i = 0; i < month - 1; i++) {
            total += months[i];
        }

        return total;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(convert(arriveAlice), convert(arriveBob));
        int end = Math.min(convert(leaveAlice), convert(leaveBob));

        return Math.max(0, end - start + 1);
    }
}