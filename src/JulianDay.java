public class JulianDay {
    int calcJulianDay(int day, int month, int year) {
        if (month <= 2){
            month += 12;
            year -= 1;
        }
    int a = year / 100;
    int b = a / 4;
    int c = 2 - a + b;
    int e = (int) (365.25 * (year + 4716));
    int f = (int) (30.6001 * (month + 1));
    return c + day + e + f - 1524;
    }
}

