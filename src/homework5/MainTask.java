package homework5;

import java.util.Scanner;
import java.util.Arrays;

public class MainTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        Task9.greetings(name);

        System.out.println("Enter array size name: ");
        int arrSize = scan.nextInt();
        int[] arrayString = Task1.task1(arrSize);
        System.out.println("Your array = " + Arrays.toString(arrayString));

        int sum = Task4.sum(arrayString);
        System.out.println("The sum is " + Task4.sum(arrayString));
        double avg = Task5.avg(arrayString);
        System.out.println("Average value of the array elements is : " + avg);
        Task6.multipleTable(avg);

        int number;
        do {
            System.out.println("Enter value between 10-1000");
            number = scan.nextInt();
        } while(number < 10 || number > 1000);

        System.out.println("correct " + number);
        System.out.println("Reverse of no. is " + Task3.reversDigits(number));
        Task2.raisedTo(Task3.reversDigits(number), 2);
        System.out.println();

        int nameLnegth = name.length();
        Task7.print(sum/nameLnegth);
    }
}
