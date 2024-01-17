package src.it.epicode.week2.day3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class UsaDate {

    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.now(); // ci da la data di oggi
        LocalDate ld2 = LocalDate.of(2020, Month.MAY, 2);
        LocalDate ld3 = LocalDate.parse("2023-05-06");


        System.out.println(ld1.getDayOfMonth());
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld1.getDayOfYear());
        System.out.println(ld1.getMonth());
        System.out.println(ld1.getMonthValue());

        System.out.println(ld1.isAfter(ld2));

        System.out.println(ld1.plusDays(20)); // restituisce un localdate diverso, non modifica l'originale
        System.out.println(ld1.until(ld2, ChronoUnit.DAYS));


        LocalTime lt1 = LocalTime.now();

        System.out.println(lt1);

        LocalTime lt2 = LocalTime.of(4,10,30);

        LocalTime lt3 = LocalTime.parse("10:34:45");

    }
}
