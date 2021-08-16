package homework3;

import java.util.Scanner;

public class Task2v2 {
    public static void main(String[] args) {
        System.out.println("Enter a time in format \"HH\"");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        String result = (hours <= 18) ? "Good day" : "Good evening";
        System.out.println(result);
    }
}

// данный способ слишком примитивный, так как не учитывает значения которые не входят в промежуток 00-24 (но по условиям задачи нужно было использовать этот способ тоже)
