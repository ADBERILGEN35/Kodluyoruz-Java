package com.kodluyoruz;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class MainDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);


        /* Java 8 */
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate specialDate = LocalDate.of(2021, 12, 30);
        System.out.println(specialDate);
        LocalDate plusDays = specialDate.plusDays(2);
        System.out.println(plusDays);

        /* LocalTime */
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime specialTime = LocalTime.of(22, 30);
        System.out.println(specialTime);

        System.out.println(localTime.isAfter(specialTime));
        LocalTime plusTime = specialTime.plus(1, ChronoUnit.HOURS);
        System.out.println(plusTime);
        System.out.println(specialTime);

        /* LocalDateTime */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime specialDateTime = LocalDateTime.of(specialDate, specialTime);
        System.out.println(specialDateTime);

        /* ZonedDateTime */
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZoneId zoneId = ZoneId.of("Europe/Istanbul");
        ZonedDateTime dateTime = ZonedDateTime.of(2021, 9, 21, 12, 30, 20, 11, zoneId);
        ZonedDateTime specialZonedDateTime = ZonedDateTime.of(specialDateTime, zoneId);
        System.out.println(specialZonedDateTime);



        /* Period */
        long between = ChronoUnit.DAYS.between(localDateTime, specialDateTime);
        System.out.println(between);

        LocalDate initial = LocalDate.now();
        System.out.println(initial);
        System.out.println(initial.plus(Period.ofDays(5)));
    }
}
