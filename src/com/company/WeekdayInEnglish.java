package com.company;

import java.util.Scanner;

public class WeekdayInEnglish {
  static public void main(String args[]){
    System.out.print("Please enter day of week (between 1 and 7):");
    String strDay = new Scanner(System.in).nextLine();
    int dayOfWeek = Integer.parseInt(strDay);

    String day;
    if( dayOfWeek == 1 ) {
      day = "Monday";
    } 
    else if ( dayOfWeek == 2 ) {
      day = "Tuesday";
      }
    else if ( dayOfWeek == 3 ) {
      day = "Wednesday";
      }
    else if ( dayOfWeek == 4 ) {
      day = "Thursday";
      }
    else if ( dayOfWeek == 5 ) {
      day = "Friday";
      }
    else if ( dayOfWeek == 6 ) {
      day = "Saturday";
      }
    else if ( dayOfWeek == 7 ) {
      day = "Sunday";
      }
    else {
      System.out.println("Day of week must be between 1 and 7.");
      return;
    }
    System.out.println("The " + dayOfWeek + " day of week is:" + day + ".");
  }
}
