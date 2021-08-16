package homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a time in format \"HH.MM\"" );
        time = scanner.nextDouble();
        if (time <= 18.00 && time >=00.00) {
            System.out.println("Good day");
        } else if (time >= 18.00 && time <=24.00) {
            System.out.println("Good evening");
        } else {
            System.out.println("Error. Use correct time format (e.g. 18.30)");
        }
    }
}
