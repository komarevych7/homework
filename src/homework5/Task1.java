package homework5;
import java.util.Random;
import java.util.Arrays;

public class Task1 {

    /*public static void main(String args[]) {
        Task1 task1 = new Task1();
        task1.task1(20);
    }*/

    static int[] task1(int num) {
        int[] arr = new int[num];
        Random randNum = new Random();
        for (int i = 0; i < num; i++) {
            arr[i] = randNum.nextInt(20);
        }
        return arr;
        //System.out.println("Random numbers = " + Arrays.toString(arr));
    }
}
