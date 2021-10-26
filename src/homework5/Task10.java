package homework5;

public class Task10 {

    public static void main(String[] args) {
        String my_array[] = {"ahmed", "suise", "3", "4"};
        Task10 separated = new Task10();
        separated.sepArray(my_array);
    }

    static void sepArray(String[] arr){
        for (String s : arr) {
            System.out.print(s + ", ");
        }
    }
}
