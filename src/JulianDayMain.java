public class JulianDayMain {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Day Month Year");
            return;
        }
        int day_ = Integer.parseInt(args[0]);
        int month_ = Integer.parseInt(args[1]);
        int year_ = Integer.parseInt(args[2]);

        int result_ = JulianDay.calcJulianDay(day_, month_, year_);
        System.out.printf("Julian day for %02d.%02d.%04d: %d\n", day_, month_, year_, result_);
    }
}
