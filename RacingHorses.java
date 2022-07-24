import java.util.Arrays;
import java.util.Scanner;

public class RacingHorses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int d[] = new int[n-1];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            Arrays.sort(a);

            for (int j = 0; j < n-1; j++) {
                d[j] = a[j+1] - a[j];
            }

            Arrays.sort(d);
            System.out.println(d[0]);

        }
        sc.close();
    }
}
