class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int days = 0;

        int feb = 28;
        if((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            feb = 29;
        }

        if(month == 1) {
            days = day;
        } else if (month == 2) { 
            days = 31 + day;
        } else if (month == 3) {
            days = 31 + feb + day;
        } else if (month == 4) {
            days = 31 + feb + 31 + day;
        } else if (month == 5) {
            days = 31 + feb + 31 + 30 + day;
        } else if (month == 6) {
            days = 31 + feb + 31 + 30 + 31 + day;
        } else if (month == 7) {
            days = 31 + feb + 31 + 30 + 31 + 30 + day;
        } else if (month == 8) {
            days = 31 + feb + 31 + 30 + 31 + 30 + 31 + day;
        } else if (month == 9) {
            days = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + day;
        } else if (month == 10) {
            days = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
        } else if (month == 11) {
            days = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
        } else if (month == 12) {
            days = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
        }

        return days;
    }
}