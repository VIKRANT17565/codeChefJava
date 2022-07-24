import java.util.Scanner;

public class TheProductMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            int a = c/GCD(b, c);
            
            System.out.println(a);
        }
        sc.close();
    }

    private static int GCD(int b, int c) {
        int gcd = 1;

        for (int i = 1; i <= b && i <= c; ++i) {

        if (b % i == 0 && c % i == 0)
            gcd = i;
        }

        return gcd;
    }
}