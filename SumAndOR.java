import java.util.Scanner;

public class SumAndOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int s = sc.nextInt();

            int output = sumAndOr(x, s);

            System.out.println(output);
            
        }
        sc.close();
    }

    private static int sumAndOr(int x, int s) {
        if (x == 1) {
            return s;
        }

        int r = (2*x)-s;

        if (r <= 0) {
            return -1;
        }
        return r;

    }
}
