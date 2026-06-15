public class JulianDayTest {
    static boolean testJulianDay() {
        int day1 = 14;
        int month1 = 6;
        int year1 = 2026;
        return JulianDay.calcJulianDay(day1, month1, year1) == 26165;
    }
}
