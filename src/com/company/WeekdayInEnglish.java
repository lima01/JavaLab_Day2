package com.company;

import java.util.Scanner;

public class WeekdayInEnglish {
  static public void main(String args[]){
    System.out.print("Please enter day of week (between 1 and 7):");
    String strDay = new Scanner(System.in).nextLine();
    int dayOfWeek = Integer.parseInt(strDay);

    String day;
    switch (dayOfWeek) {
      case 1:
        day = "Monday";
        break;
      case 2:
        day = "Tuesday";
        break;
      case 3:
        day = "Wednesday";
        break;
      case 4:
        day = "Thursday";
        break;
      case 5:
        day = "Friday";
        break;
      case 6:
        day = "Saturday";
        break;
      case 7:
        day = "Sunday";
        break;
      default:
        System.out.println("Day of week must be between 1 and 7.");
        return;
    }
    System.out.println("The " + dayOfWeek + " day of week is:" + day + ".");
  }
}
