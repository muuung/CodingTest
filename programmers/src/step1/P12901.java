package step1;
import java.time.*;

/* 2016년 (통과) */
public class P12901 {
    public String solution(int a, int b) {
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dow = date.getDayOfWeek();
        int day = dow.getValue();
        return days[day-1];
    }
}