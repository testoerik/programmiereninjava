public class JulianDay {
    static int calcJulianDay(int day, int month, int year) {
        if (month <= 2){
            month += 12;
            year -= 1;
        }
    int a_ = year / 100;
    int b_ = a_ / 4;
    int c_ = 2 - a_ + b_;
    int e_ = (int) (365.25 * (year + 4716));
    int f_ = (int) (30.6001 * (month + 1));
    return c_ + day + e_ + f_ - 1524;
    }
}

