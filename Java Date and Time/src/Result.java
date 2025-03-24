import java.util.Calendar;
import java.util.GregorianCalendar;

public class Result {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return switch (dayOfWeek) {
            case Calendar.SUNDAY ->  "SUNDAY";
            case Calendar.MONDAY -> "MONDAY";
            case Calendar.TUESDAY -> "TUESDAY";
            case Calendar.WEDNESDAY -> "WEDNESDAY";
            case Calendar.THURSDAY -> "THURSDAY";
            case Calendar.FRIDAY -> "FRIDAY";
            case Calendar.SATURDAY -> "SATURDAY";
            default -> "Unknown";
        };


    }

}
