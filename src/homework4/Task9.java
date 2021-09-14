package homework4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter qty of elements in the array: ");
        int size = input.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = 1 + i;
        }

        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
    }
}
