package homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int i = scan.nextInt();
        int j = scan.nextInt();

        long result = 1;

        for (; j != 0; --j) {
            result *= i;
        }

        System.out.println("Answer = " + result);
    }
}

