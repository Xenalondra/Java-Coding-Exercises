/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Alondra Bio
 */
public class AgeCalculator {

    static LocalDate today = LocalDate.now();
    static LocalDate birthday;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FastReader reader = new FastReader();

            System.out.println("AGE CALCULATOR");

            System.out.print("Enter your birth month (1-12) : ");
            int month = reader.nextInt();
            System.out.print("Enter your birth day (1-31)   : ");
            int day = reader.nextInt();
            System.out.print("Enter your birth year (1-" + today.getYear() + "): ");
            int year = reader.nextInt();

            birthday = LocalDate.of(year, month, day);

            if (valid(month, day, year) && !birthday.isAfter(today)) {
                String ageResult = computeAge(birthday);
                System.out.println(ageResult);
            } else {
                System.out.println("Invalid input. Please enter a valid day (1-31), month (1-12), and year (1-" + today.getYear() + ").");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values for day, month, and year.");
        }
    }

    private static String computeAge(LocalDate birthday) {
        Period age = Period.between(birthday, today);
        return "\nAs of today (" + today + "), you are "
                + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days old.";
    }

    private static boolean valid(int month, int day, int year) {
        return (month >= 1 && month <= 12)
                && (year > 0 && year <= today.getYear()) && isValidDay(day, month);
    }

    private static boolean isValidDay(int day, int month) {
        if (day >= 1 && day <= 31) {
            return 
                switch (month) {
                case 4, 6, 9, 11 -> day <= 30;
                case 2 -> day <= (birthday.isLeapYear() ? 29 : 28); // Check for February and handle leap years
                default -> true;
            };
        }
        return false;
    }
}
