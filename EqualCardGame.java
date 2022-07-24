import java.util.Scanner;

public class EqualCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int deck = 52;
            int count = 0;

            while (deck%k != 0) {
                deck--;
                count++;
            }

            System.out.println(count);

        }
        sc.close();
    }
}