package homework2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter inches: ");
        Float inches = scan.nextFloat();
        Float meters = inches * 0.0254f;
        System.out.println(inches + " inches = " + meters);
    }
}
