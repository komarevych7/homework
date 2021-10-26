package homework5;

public class Task8 {

    public static void main(String[] args) {
        Task8 rec = new Task8();
        rec.print_rectangle(8,4);
    }

    static void print_rectangle(int n, int m)
    {
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= m; j++)
            {
                if (i == 1 || i == n ||
                        j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
