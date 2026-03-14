public class DayoftheWeek {
    public static void main(String[] args) {
        int day = 31;
        int month = 8;
        int year = 2019;
        String result = dayOfTheWeek(day, month, year);
        System.out.println(result);
    }
    
    public static String dayOfTheWeek(int day, int month, int year) {

        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; // days of the week

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};                                // days in each month

        int totalDays = 0;

        // count days for previous years
        for (int y = 1971; y < year; y++) {

            if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {       // leap year condition check
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        // count days for previous months
        for (int m = 1; m < month; m++) {
            totalDays += days[m - 1];                     // m - 1 because array is 0-indexed
        }

        // leap year adjustment for current year
        if (month > 2 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            totalDays += 1;
        }

        totalDays += day;

        return week[(totalDays + 4) % 7];
    }
}
