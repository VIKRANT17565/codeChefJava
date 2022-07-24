import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, digit, countFour = 0;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n =sc.nextInt();
            while (n != 0) {
                digit = n - (n/10 * 10);
                n = n/10;
                if (digit == 4) {
                    countFour++;
                }
            }
            System.out.println(countFour);
            countFour = 0;
        }
        sc.close();
    }
}
