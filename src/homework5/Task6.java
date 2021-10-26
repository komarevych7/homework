package homework5;

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.multipleTable(2);
    }

    static void multipleTable(double i){
        if (i > 0) {
            for (int j = 2; j < 10; j++) {
                System.out.println( i + " x " + j + " = " + i*j);
            }
        } else {
            System.out.println("not positive integer");
        }
    }
}
