package d30JavaPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C09_LocalDate {
    public static void main(String[] args) {

     //- Ali was born 45 years, 8 months, and 5 days after 29.10.1923.
        LocalDate alisBirth = LocalDate.of(1923,10,29);
        alisBirth=alisBirth.plusYears(45).plusMonths(8).plusDays(5);
        System.out.println("alisBirth = " + alisBirth);

        //- Veli was born 24 years, 2 months, and 11 days before 15.09.1993.
        LocalDate VelisBirthday=LocalDate.of(1993,9,15);
        VelisBirthday=VelisBirthday.minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("VelisBirthday = " + VelisBirthday);


        //- Calculate and print the birth dates of Ali and Veli.
        System.out.println("alisBirth = " + alisBirth);
        System.out.println("VelisBirthday = " + VelisBirthday);

        //- Print Ali's birth date in Print Ali's birth date in the format DD/MM/YY..
        DateTimeFormatter frmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("alisBirth.format(frmt) = " + alisBirth.format(frmt));

        //- Write a code to check if Ali and Veli's birth dates are the same.
        boolean isSame=alisBirth.equals(VelisBirthday);
        System.out.println("isSame = " + isSame);

    }
}
