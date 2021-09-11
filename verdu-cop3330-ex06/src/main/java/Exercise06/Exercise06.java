package Exercise06;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;
import java.util.Calendar;

public class Exercise06 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String CurrentAge = scanner.nextLine();

        System.out.print("At what age would you like to retire? ");
        String RetireAge = scanner.nextLine();

        int CurAge = Integer.parseInt(CurrentAge);
        int RetAge = Integer.parseInt(RetireAge);

        int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("You have " + (RetAge-CurAge) + " years left until you can retire.");
        System.out.print("It's " + CurrentYear + ", so you can retire in " + (CurrentYear+(RetAge-CurAge)) + ".");


    }

}
