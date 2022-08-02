public class NextDayCalculator {
    public static Date calculateNextDay(Date date) {

        int day, month, year;

        boolean lastDayOfYear = date.getDay() == 31 && date.getMonth() == 12;

        boolean lastDayOfMonth = date.getDay() == getDayOfMonth(date);

        if (lastDayOfYear) {
            day = 1;
            month = 1;
            year = date.getYear() + 1;
        } else {
            if (lastDayOfMonth) {
                day = 1;
                month = date.getMonth() + 1;
            } else {
                day = date.getDay() + 1;
                month = date.getMonth();
            }
            year = date.getYear();
        }

        return new Date(day, month, year);
//        throw new UnsupportedOperationException();
    }

    private static int getDayOfMonth(Date date) {
        int days = 0;
        switch (date.getMonth()) {
            case 2:
                days = isLeapYear(date.getYear()) ? 29 : 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
        }
        return days;
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
