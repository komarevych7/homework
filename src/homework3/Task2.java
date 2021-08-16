package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int hours;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a time in format \"HH\"" );
        hours = scanner.nextInt();
        if (hours >= 0 && hours <=10) {
            System.out.println("Good morning");
        } else if (hours > 10 && hours <=18) {
            System.out.println("Good day");
        } else if (hours > 18 && hours <=24) {
            System.out.println("Good evening");
        } else {
            System.out.println("Error. Use correct time format (e.g. 18.30)");
        }
    }
}
