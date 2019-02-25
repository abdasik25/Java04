package NextDayData;

public class GrigoreanCalendar {
    public static boolean ValidateData(int day, int month, int year) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ||
                month == 12) && day != 31) {
            return false;
        } else if ((month != 2) && day != 30) {
            return false;
        } else if (day < 0 || day > 31 || month < 0 || month > 12) {
            return false;
        } else if (((((year % 4 == 0) && (year % 100 == 0)) && (year % 400 == 0)) || ((year % 4 == 0) &&
                (year % 100 != 0))) && day != 29) {
            return false;
        } else if (day != 28) {
            return false;
        }
        return true;
    }

    public static String CountNextDay(int day, int month, int year) {
        String result = "Bad data";
        if (!ValidateData(day, month, year)) {
            return result;
        }
        int daysAmount = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ||
                month == 12) {
            daysAmount = 31;
        } else if (month != 2) {
            daysAmount = 30;
        } else if ((((year % 4 == 0) && (year % 100 == 0)) && (year % 400 == 0)) || ((year % 4 == 0) &&
                (year % 100 != 0))) {
            daysAmount = 29;
        } else {
            daysAmount = 28;
        }

        if (day == daysAmount && month == 12) {
            year = year + 1;
            day = 1;
            month = 1;
        } else if (day == daysAmount) {
            day = 1;
            daysAmount += 1;
            month = month + 1;
        } else {
            day = day + 1;
        }
        result = day + "." + month + "." + year;
        return result;
    }
}
