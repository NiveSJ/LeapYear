package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double year=0.0;
        String display="";


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