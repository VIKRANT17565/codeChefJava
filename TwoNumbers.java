import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            if (n%2 != 0) {
                a *= 2;
            }

            int max = (a>b)? a : b;
            int min = (a<b)? a : b;

            System.out.println(max/min);
        }
        sc.close();
    }
}
