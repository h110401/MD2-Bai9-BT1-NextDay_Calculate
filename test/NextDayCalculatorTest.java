import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void calculateD1M1Y2018() {
        Date date = new Date(1, 1, 2018);

        Date expected = new Date(2, 1, 2018);
        Date result = NextDayCalculator.calculateNextDay(date);

        assertEquals(expected, result);
    }

    @Test
    void calculateD31M1Y2018() {
        Date date = new Date(31, 1, 2018);

        Date expected = new Date(1, 2, 2018);
        Date result = NextDayCalculator.calculateNextDay(date);

        assertEquals(expected, result);
    }

    @Test
    void calculateD30M4Y2018() {
        Date date = new Date(30, 4, 2018);

        Date expected = new Date(1, 5, 2018);
        Date result = NextDayCalculator.calculateNextDay(date);

        assertEquals(expected, result);
    }

    @Test
    void calculateD28M2Y2018() {
        Date date = new Date(28, 2, 2018);

        Date expected = new Date(1, 3, 2018);
        Date result = NextDayCalculator.calculateNextDay(date);

        assertEquals(expected, result);
    }

    @Test
    void calculateD29M2Y2020() {
        Date date = new Date(29, 2, 2020);

        Date expected = new Date(1, 3, 2020);
        Date result = NextDayCalculator.calculateNextDay(date);

        assertEquals(expected, result);
    }

    @Test
    void calculateD31M12Y2018() {
        Date date = new Date(31, 12, 2018);

        Date expected = new Date(1, 1, 2019);
        Date result = NextDayCalculator.calculateNextDay(date);

        assertEquals(expected, result);
    }
}