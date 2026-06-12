public class JulianDayMain {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Day Month Year");
            return;
        }
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        JulianDay result = new JulianDay();
        result.calcJulianDay(day, month, year);
        printf("Julian day for %02d.%02d.%04d: \n", day, month, year, result);
    }
}
