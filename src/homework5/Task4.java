package homework5;

public class Task4 {

    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Task4 task4 = new Task4();
        task4.sum(my_array);
    }

    static int sum(int[] arr){
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }
}
