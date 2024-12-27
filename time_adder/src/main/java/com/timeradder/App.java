package com.timeradder;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the current hour");
        int currentHour = userInput.nextInt();
        System.out.println("Enter the current minute");
        int currentMinute = userInput.nextInt();
        System.out.println("Enter the current seconds");
        int currentSecond = userInput.nextInt();
        System.out.println("Now, the current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

        System.out.println("Enter the number of hours to add");
        int hoursForward = userInput.nextInt();
        System.out.println("Enter the number of minutes to add");
        int minutesForward = userInput.nextInt();
        System.out.println("Enter the number of seconds to add");
        int secondsForward = userInput.nextInt();

        System.out.println("Adding " + hoursForward + " hours, " + minutesForward + " minutes, and " + secondsForward + " seconds to the current time");
        System.out.println("The new time is " + TimeAdder.addTime(currentHour, currentMinute, currentSecond, hoursForward, minutesForward, secondsForward));

        userInput.close();
    }
}
