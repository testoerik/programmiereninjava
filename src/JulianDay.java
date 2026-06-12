public class JulianDay {
    void calcJulianDay(int day, int month, int year) {
        if (month <= 2){
            month += 12;
            year -= 1;
        }
    int a = year / 100;
    int b = a / 4;
    int c = 2 - a + b;

    }
}

