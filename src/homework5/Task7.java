package homework5;

public class Task7 {

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        task7.print(7);
    }

    static void print(int max){
        for (int i = 1; i < max; i++) {
            for (int j = 0; j <= i; j++ ) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
