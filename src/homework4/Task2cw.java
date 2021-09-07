package homework4;

import java.util.Scanner;

public class Task2cw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin = 1111;
        System.out.println("Enter pin");

        for (int j=1; j<5; j++) {
            if (j != 4) {
                if (pin == scan.nextInt()) {
                    System.out.println("Good");
                    break;
                } else { if (j==3) {
                    System.out.println("ban");
                } else {
                    System.out.println("Fail");
                    continue;
                }
                }
            }
        }

    }
}
