package homework5;

public class Task5 {

    /*public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Task5 task5 = new Task5();
        task5.avg(my_array);

    }*/

    static double avg(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        double average = sum / arr.length;
       // System.out.println("Average value of the array elements is : " + average);
        return average;
    }
}
