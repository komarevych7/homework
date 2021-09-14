package homework4;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
    }
}
