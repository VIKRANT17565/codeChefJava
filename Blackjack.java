import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 21 - (a + b);
            if (c <= 10) {
                System.out.println(c);
            }
            else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
