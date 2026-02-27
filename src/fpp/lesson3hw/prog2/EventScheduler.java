package fpp.lesson3hw.prog2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class EventScheduler {

    void main(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your event name: ");
        String eventName = scanner.nextLine();
        System.out.print("Enter the date of the Event (MM/dd/yyyy):  ");
        String eventDate = scanner.nextLine();
        System.out.print("Enter the time of the Event (HH:mm):  ");
        String eventTime = scanner.nextLine();

        String finalDate = eventDate + " " + eventTime;
        LocalDateTime userDate = LocalDateTime.parse(finalDate, DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));
        ZonedDateTime zonedDateTime = ZonedDateTime.of(userDate, TimeZone.getDefault().toZoneId());


        System.out.println("Day of the week: " + zonedDateTime.getDayOfWeek() );
        System.out.println("It is a leap year: " + zonedDateTime.toLocalDate().isLeapYear() );

        ZonedDateTime now = ZonedDateTime.now();
        long daysUntil = ChronoUnit.DAYS.between(now.toLocalDate(), zonedDateTime.toLocalDate());
        System.out.println("Days until event: " +  daysUntil);
        displayEventDate(zonedDateTime);


        System.out.print("Enter the target time zone: ");
        String targetTimeZone = scanner.nextLine();
        zonedDateTime = convertTimeZone(zonedDateTime, targetTimeZone);
        displayEventDate(zonedDateTime);
    }

    public void  displayEventDate(ZonedDateTime userDate) {
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern(
                "EEEE, MMMM d, yyyy '@' HH:mm '['VV']'");

        System.out.println(userDate.format(formatter));
    }

    public  ZonedDateTime convertTimeZone(ZonedDateTime zonedDateTime, String targetTimeZone) {
        ZoneId zoneId = ZoneId.of(targetTimeZone);
        return  zonedDateTime.withZoneSameInstant(zoneId);
    }
}
