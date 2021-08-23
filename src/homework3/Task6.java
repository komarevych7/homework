package homework3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }
}
