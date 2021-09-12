package homework4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int summ = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scan.nextInt();
        int array[] = new int[size];

        System.out.println("Insert array elements:");
            for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
            for (int j = 0; j < size; j++) {
            summ = summ + array[j];
        }
        System.out.println(summ);
    }
}
