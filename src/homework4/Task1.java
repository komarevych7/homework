package homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int i = scan.nextInt();
        if (i > 0) {
            for (int j = 2; j < 10; j++) {
                System.out.println( i + " x " + j + " = " + i*j);
            }
        } else {
            System.out.println("not positive integer");
        }
    }
}
