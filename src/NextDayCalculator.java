import java.time.DateTimeException;
import java.time.LocalDate;

public class NextDayCalculator {
    public static void main(String[] args) {
        calculateNextDay(1, 1, 2001);
    }

    public static void calculateNextDay(int day, int month, int year) {
        try {
            LocalDate start = LocalDate.of(year, month, day);
            System.out.println(start.plusDays(1));
        } catch (DateTimeException e) {
            System.out.println("Invalid date");
        }
    }
}
