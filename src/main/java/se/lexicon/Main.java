package se.lexicon;

import java.util.Scanner;

/* java 8 New feature:

import java.time.LocalDate;

has isLeapYear() to check leap year
*/


public class Main {
    public static void main(String[] args) {

        int year;
        String display;


        System.out.println("Enter a year to check whether it is leap year ");
        Scanner YearInput= new Scanner(System.in);
        year = YearInput.nextInt();






       if (year % 4 != 0.0){

           display ="Not a Leap Year";
       }

       else if(year % 100 !=0.0) {
           display="Leap Year";

        }
       else if (year%400 != 0.0){
           display= "Not a leap year";
       }

       else
           display="Leap Year";

        System.out.println("Given Year is :" + display);





    }
}