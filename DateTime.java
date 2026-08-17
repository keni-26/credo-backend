import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        System.out.println("Current Date (Date Class)");

        Date today = new Date();

        System.out.println(today);

        System.out.println("-----------------------------");


        System.out.println("LocalDate");

        LocalDate date = LocalDate.now();

        System.out.println("Current Date : " + date);
        System.out.println("Plus 2 Years : " + date.plusYears(2));
        System.out.println("Minus 2 Years : " + date.minusYears(2));
        System.out.println("Plus 2 Months : " + date.plusMonths(2));
        System.out.println("Minus 2 Months : " + date.minusMonths(2));
        System.out.println("Plus 10 Days : " + date.plusDays(10));
        System.out.println("Minus 10 Days : " + date.minusDays(10));

        System.out.println("Day : " + date.getDayOfMonth());
        System.out.println("Month : " + date.getMonth());
        System.out.println("Month Value : " + date.getMonthValue());
        System.out.println("Year : " + date.getYear());

        System.out.println("-----------------------------");



        System.out.println("LocalTime");

        LocalTime time = LocalTime.now();

        System.out.println("Current Time : " + time);
        System.out.println("Plus 10 Minutes : " + time.plusMinutes(10));
        System.out.println("Minus 10 Minutes : " + time.minusMinutes(10));
        System.out.println("Plus 4 Hours : " + time.plusHours(4));
        System.out.println("Minus 4 Hours : " + time.minusHours(4));

        System.out.println("Hour : " + time.getHour());
        System.out.println("Minute : " + time.getMinute());
        System.out.println("Second : " + time.getSecond());

        System.out.println("-----------------------------");


        System.out.println("LocalDateTime");

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);

        System.out.println("Year : " + dateTime.getYear());
        System.out.println("Month : " + dateTime.getMonth());
        System.out.println("Day : " + dateTime.getDayOfMonth());
        System.out.println("Hour : " + dateTime.getHour());
        System.out.println("Minute : " + dateTime.getMinute());

        System.out.println("-----------------------------");



        System.out.println("DateTimeFormatter");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMM yyyy hh:mm a");

        System.out.println(dateTime.format(formatter));

        System.out.println("-----------------------------");

        System.out.println("Period");

        LocalDate start = LocalDate.of(1997, 12, 9);
        LocalDate end = LocalDate.now();

        Period period = Period.between(start, end);

        System.out.println("Years : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days : " + period.getDays());

        System.out.println("-----------------------------");

        System.out.println("Duration");

        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(12, 45);

        Duration duration = Duration.between(time1, time2);

        System.out.println("Hours : " + duration.toHours());
        System.out.println("Minutes : " + duration.toMinutes());

        System.out.println("-----------------------------");

        System.out.println("Calendar");

        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Date : " + calendar.getTime());

        System.out.println("Hour : " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute : " + calendar.get(Calendar.MINUTE));
        System.out.println("Second : " + calendar.get(Calendar.SECOND));
        System.out.println("Year : " + calendar.get(Calendar.YEAR));
        System.out.println("Month : " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day : " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("-----------------------------");


        System.out.println("Calendar Date Manipulation");

        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.DECEMBER, 25);

        System.out.println("Original Date : " + cal.getTime());

        cal.add(Calendar.MONTH, -2);
        cal.add(Calendar.DAY_OF_MONTH, 10);

        System.out.println("Modified Date : " + cal.getTime());


        System.out.println("Current Day of Week");

        System.out.println(LocalDate.now().getDayOfWeek());

        System.out.println("-----------------------------");



        System.out.println("Day Number in Year");

        System.out.println(LocalDate.now().getDayOfYear());

        System.out.println("-----------------------------");



        System.out.println("Date of Birth");

        LocalDate dob = LocalDate.of(2005, 6, 26);

        System.out.println(dob);

        System.out.println("-----------------------------");



        System.out.println("isBefore()");

        LocalDate date1 = LocalDate.of(2024, 1, 1);
        LocalDate date2 = LocalDate.of(2025, 1, 1);

        System.out.println(date1.isBefore(date2));

        System.out.println("-----------------------------");



        System.out.println("isAfter()");

        System.out.println(date2.isAfter(date1));

        System.out.println("-----------------------------");


        System.out.println("isEqual()");

        LocalDate date3 = LocalDate.of(2025, 1, 1);

        System.out.println(date2.isEqual(date3));

        System.out.println("-----------------------------");

        System.out.println("Employee Joining Date");

        LocalDate joiningDate = LocalDate.now();

        LocalDate confirmation = joiningDate.plusYears(1).plusMonths(6);

        System.out.println("Joining Date : " + joiningDate);

        System.out.println("After 1 Year 6 Months : " + confirmation);

        System.out.println("-----------------------------");


        System.out.println("Student Age Calculator");

        LocalDate birthDate = LocalDate.of(2005, 6, 26);

        LocalDate currentDate = LocalDate.now();

        Period age =  Period.between(birthDate, currentDate);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Birth Date : " + birthDate.format(format));

        System.out.println("Current Date : " + currentDate);

        System.out.println("Age : " + age.getYears() + " Years");

        System.out.println("Weekday : " + currentDate.getDayOfWeek());

        System.out.println("-----------------------------");

    }
}