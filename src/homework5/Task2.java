package homework5;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.raisedTo(3, 2);
    }

    static void raisedTo(int no1, int no2) {
        int ans = 1;
        for (int i = 1; i <= no2; i++) {
            ans = ans * no1;
        }
        System.out.print(no1 + " raised to " + no2 + " is " + ans);
    }
}
